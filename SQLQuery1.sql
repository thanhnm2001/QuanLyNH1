﻿create database QLNH
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
anh nvarchar(50) null,
primary key(mama)
)
select * from monan

create table hoadon(
mahd nvarchar(10) not null,
makh nvarchar(10) not null,
manv nvarchar(10) not null,
maban nvarchar(10) not null,
thanhtien float,
ngaylap datetime,
CONSTRAINT FK_HOADON PRIMARY KEY(MAHD),
foreign key (makh) references khachhang(makh),
foreign key (manv) references nhanvien(manv),
foreign key (maban) references ban(maban)
)
select * from hoadon
create table cthd(
mahd nvarchar(10) null,
mama nvarchar(10) null,
soluong int,
<<<<<<< HEAD
thanhtien money,

foreign key (mahd) references hoadon ON DELETE CASCADE ,
=======
foreign key (mahd) references hoadon, 
>>>>>>> 98ce6e8a0f70f45f1826ea003dc083032f689b2e
foreign key (mama) references monan
)
<<<<<<< HEAD
drop table hoadonct
CREATE TABLE HOADONCT
(
	MAHD NVARCHAR(10) NULL,
	MAMA NVARCHAR(10) NULL,
	SLBAN INT NULL,
	CONSTRAINT FK_HOADON_HOADONCT FOREIGN KEY(MAHD)
	REFERENCES HOADON,
	CONSTRAINT FK_MONAN_HOADONCT FOREIGN KEY(MAMA)
	REFERENCES MONAN
	)
=======
drop table hoadon
drop table cthd
>>>>>>> 043ab65e4bcff9ad6c3205d9fd057632f59d26e5
drop table monan
<<<<<<< HEAD
drop table ban
select * from nhanvien
=======
drop table cthd
select * from nhanvien 
>>>>>>> 98ce6e8a0f70f45f1826ea003dc083032f689b2e
insert into nhanvien values('ThanhNM','Thanh Nguyen','2001-11-11','0345678',1,'123431','1234578')
insert into nhanvien values('ChungNQ','Chung Nguyen','2001-11-11','0345678',1,'123431','1234578')
insert into nhanvien values('TuanDV',	'Tuan Dong','2001-11-11','0345678',1,'123431','1234578')
select * from khachhang
insert into khachhang values ('KH01','THanh Nam','1991-11-11','314313143','1235213')
insert into khachhang values ('KH02','Dung Nam','1991-11-11','314313143','1235213')
insert into khachhang values ('KH03','Gdcu Nam','1991-11-11','314313143','1235213')
select * from monan

insert into monan values ('MC04',N'Lẩu Gà',100000,null,N'Hoạt Động', 'lau ga.jpg')
insert into monan values ('MC05',N'Lẩu Bò',130000,null,N'Hoạt Động', 'lau bo.jpg')
insert into monan values ('MC06',N'Lẩu Hải Sản',150000,null,N'Hoạt Động', 'lau hai san.jpg')
insert into monan values ('MC01',N'Súp Cua',30000,null,N'Hoạt Động','New Project.jpg')
insert into monan values ('MC02',N'Súp Gà',20000,null,N'Hoạt Động', 'sup ga.jpg')
insert into monan values ('MC03',N'Súp Chay',20000,null,N'Hoạt Động', 'sup chay.jpg')
insert into monan values ('MC07',N'Cơm Niêu',45000,null,N'Hoạt Động', 'com nieu.jpg')
insert into monan values ('MC08',N'Cơm Bò Lắc',45000,null,N'Hoạt Động', 'com-bo-luc-lac.jpg')
insert into monan values ('MC09',N'Mực Nướng',60000,null,N'Hoạt Động', N'Mực-nướng-bơ.jpg')
insert into monan values ('MC10',N'Bò Bít Tết',70000,null,N'Hoạt Động', 'bo bit tet.jpg')

insert into monan values ('DU01',N'Lavie',10000,null,N'Hoạt Động', 'lavie.png')
insert into monan values ('DU02',N'Coca Cola',25000,null,N'Hoạt Động', 'coca.jpg')
insert into monan values ('DU03',N'7Up',25000,null,N'Hoạt Động', '7up.jpg')
insert into monan values ('DU04',N'Trà Đá',8000,null,N'Hoạt Động', 'tra da.jpg')
insert into monan values ('DU05',N'Vodka',70000,null,N'Hoạt Động', 'vodka.jpg')
insert into monan values ('DU06',N'Vang Đỏ',170000,null,N'Hoạt Động', 'vang do.png')
insert into monan values ('DU07',N'Rượu Mơ',70000,null,N'Hoạt Động', 'ruou mo.jpg')

insert into monan values ('TM01',N'Hoa Quả',50000,null,N'Hoạt Động', 'hoa qua.jpg')
insert into monan values ('TM02',N'Kem Ly',20000,null,N'Hoạt Động', 'kem ly.jpg')
insert into monan values ('TM03',N'Sữa Chua',15000,null,N'Hoạt Động', 'sua chua.jpg')
insert into monan values ('TM04',N'Chè Nhãn',20000,null,N'Hoạt Động', 'che nhan.jpg')
insert into monan values ('TM05',N'Pudding',25000,null,N'Hoạt Động', 'pudding.jpg')
insert into monan values ('TM06',N'Chè Cốm',20000,null,N'Hoạt Động', 'che com.jpg')

select * from ban
insert into ban values ('B01','ban01','trong nha','Trong')
insert into ban values ('B02','ban02','trong nha','Trong')
insert into ban values ('B03','ban03','trong nha','Trong')
insert into ban values ('B04','ban03','trong nha','Trong')
insert into ban values ('B05','ban03','trong nha','Trong')
insert into ban values ('B06','ban03','trong nha','Trong')
insert into ban values ('B07','ban03','trong nha','Trong')
insert into ban values ('B08','ban03','trong nha','Trong')
insert into ban values ('B09','ban03','trong nha','Trong')
insert into ban values ('B13','ban03','trong nha','Trong')
	delete ban where maban='b13'
select * from hoadon
select * from cthd
<<<<<<< HEAD

insert into hoadon values ('HD01','KH01','ThanhNM','B01',1200000,'2020-11-22')
insert into hoadon values ('HD02','KH03','ThanhNM','B02',1200000,'2020-11-22')
insert into hoadon values ('HD04','KH02','ThanhNM','B03',1200000,'2020-11-22')
insert into cthd values ('HD02','MC01',2, 60000)
insert into cthd values ('HD02','TM02',2, 40000)
insert into cthd values ('HD01','TM03',1, 15000)
insert into cthd values ('HD01','MC04',2, 200000)


=======
insert into cthd values ('HD02','MC01',2)
drop table hoadoninsert into cthd values ('HD02','TM02',2)

drop table cthd
select * from ban
delete from ban
delete from hoadon
update ban set trangthai='dang hoat dong' where maban='b03'
>>>>>>> 98ce6e8a0f70f45f1826ea003dc083032f689b2e

select * from ban
select * from monan
select * from nhanvien
select * from hoadon
delete from hoadon where mahd='kh7'
select * from khachhang
select * from cthd
insert into khachhang values('KH04','Thanh Nguyen','1991-11-11','0345690216','79823173')
insert into hoadon values ('HD1','KH04','ThanhNM','B01',20000,'1991-11-11')
insert into hoadon values ('HD2','KH04','ThanhNM','B01',20000,'1991-11-11')
insert into cthd values ('','',2)
select * from hoadonct
insert into hoadon values ('HD6','KH04','ThanhNM','B02',20000,'1991-11-11 19:10:22')
select top 9 khachhang.makh,hoten,ngaysinh,sdt,socmt,mahd,ngaylap,thanhtien,maban from khachhang join hoadon on khachhang.makh=hoadon.makh where maban='b07' order by ngaylap DESC



drop table cthd
drop table hoadon
select * from hoadon
select * from cthd
select * from hoadon
select * from khachhang
select * from cthd where mahd='hd11'
