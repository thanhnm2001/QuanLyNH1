create database QLNH
--CREATE FUNCTION AUTO_IDKH()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(MAKH) FROM KHACHHANG) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(MAKH, 3)) FROM KHACHHANG
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'KH00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 THEN 'KH0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
--
create table nhanvien (
manv nvarchar(10) not null,
hoten nvarchar(50) not null,
ngaysinh date not null,
sdt nvarchar(20) not null,
chucvu bit not null,
password nvarchar(20) not null,
socmt nvarchar(20) not null,
primary key(manv)
);
--insert nhanvien values('Thanh','2001-11-11','0345690216',1,'abcdsa','1234567')
--insert nhanvien values('Thanh','0345768','thhanhthuyduyen','mggm@mfa')
drop table nhanvien
select * from nhanvien
create table khachhang(
makh nvarchar(10) not null,
hoten nvarchar(50) not null,
ngaysinh date  null,
sdt nvarchar(20) null,
socmt nvarchar(20),
primary key(makh)

)
create table ban(
maban nvarchar(10) not null,
tenban nvarchar(20) not null,
loaiban nvarchar(20) not null,
trangthai nvarchar(20) not null,
primary key(maban)
)
select * from ban
--CREATE TABLE NHANVIEN(
	MAKH CHAR(5) PRIMARY KEY CONSTRAINT IDKH DEFAULT DBO.AUTO_IDKH(),
	HOTEN NVARCHAR(50) NOT NULL,
	SDT VARCHAR(11) NULL,
	DIACHI NVARCHAR(100) NULL,
	EMAIL VARCHAR(50) NULL
)--
create table monan(
maMA nvarchar(10) not null,
tenmon nvarchar(50) not null,
dongia float not null,
mota nvarchar(50) null,
trangthai nvarchar(20) not null,
primary key(mama)
)
select * from monan

create table hoadon(
mahd nvarchar(10) not null,
makh nvarchar(10) not null,
manv nvarchar(10) not null,
maban nvarchar(10) not null,
thanhtien float,
ngaylap date,
primary key(mahd),
foreign key (makh) references khachhang(makh),
foreign key (manv) references nhanvien(manv),
foreign key (maban) references ban(maban)
)
select * from hoadon
create table cthd(
mahd nvarchar(10) null,
mama nvarchar(10) null,
soluong int,

foreign key (mahd) references hoadon ON DELETE CASCADE ,
foreign key (mama) references monan
ON DELETE CASCADE 
)
drop table monan
select * from nhanvien
insert into nhanvien values('ThanhNM','Thanh Nguyen','2001-11-11','0345678',1,'123431','1234578')
insert into nhanvien values('ChungNQ','Chung Nguyen','2001-11-11','0345678',1,'123431','1234578')
insert into nhanvien values('TuanDV','Tuan Dong','2001-11-11','0345678',1,'123431','1234578')
select * from khachhang
insert into khachhang values ('KH01','THanh Nam','1991-11-11','314313143','1235213')
insert into khachhang values ('KH02','Dung Nam','1991-11-11','314313143','1235213')
insert into khachhang values ('KH03','Gdcu Nam','1991-11-11','314313143','1235213')
select * from monan

insert into monan values ('MC04',N'Lẩu Gà',100000,null,N'Hoạt Động')
insert into monan values ('MC05',N'Lẩu Bò',130000,null,N'Hoạt Động')
insert into monan values ('MC06',N'Lẩu Hải Sản',150000,null,N'Hoạt Động')
insert into monan values ('MC01',N'Súp Cua',30000,null,N'Hoạt Động')
insert into monan values ('MC02',N'Súp Gà',20000,null,N'Hoạt Động')
insert into monan values ('MC03',N'Súp Chay',20000,null,N'Hoạt Động')
insert into monan values ('MC07',N'Cơm Niêu',45000,null,N'Hoạt Động')
insert into monan values ('MC08',N'Cơm Bò Lắc',45000,null,N'Hoạt Động')
insert into monan values ('MC09',N'Mực Nướng',60000,null,N'Hoạt Động')
insert into monan values ('MC10',N'Bò Bít Tết',70000,null,N'Hoạt Động')

insert into monan values ('DU01',N'Lavie',10000,null,N'Hoạt Động')
insert into monan values ('DU02',N'Coca Cola',25000,null,N'Hoạt Động')
insert into monan values ('DU03',N'7Up',25000,null,N'Hoạt Động')
insert into monan values ('DU04',N'Trà Đá',8000,null,N'Hoạt Động')
insert into monan values ('DU05',N'Vodka',70000,null,N'Hoạt Động')
insert into monan values ('DU06',N'Vang Đỏ',170000,null,N'Hoạt Động')
insert into monan values ('DU07',N'Rượu Mơ',70000,null,N'Hoạt Động')

insert into monan values ('TM01',N'Hoa Quả',50000,null,N'Hoạt Động')
insert into monan values ('TM02',N'Kem Ly',20000,null,N'Hoạt Động')
insert into monan values ('TM03',N'Sữa Chua',15000,null,N'Hoạt Động')
insert into monan values ('TM04',N'Chè Nhãn',20000,null,N'Hoạt Động')
insert into monan values ('TM05',N'Pudding',25000,null,N'Hoạt Động')
insert into monan values ('TM06',N'Chè Cốm',20000,null,N'Hoạt Động')



select * from ban
insert into ban values ('B01','ban01','trong nha','Hoat dong')
insert into ban values ('B02','ban02','trong nha','Hoat dong')
insert into ban values ('B03','ban03','trong nha','Hoat dong')
select * from hoadon
insert into hoadon values ('HD01','KH01','ThanhNM','B01',1200000,'2020-11-22')
insert into hoadon values ('HD02','KH03','ThanhNM','B01',1200000,'2020-11-22')
insert into hoadon values ('HD04','KH02','ThanhNM','B01',1200000,'2020-11-22')
select * from cthd
insert into cthd values ('HD02','MC01',2)
insert into cthd values ('HD02','TM02',2)

