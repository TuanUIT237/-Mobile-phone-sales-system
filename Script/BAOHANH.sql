--DATABASE QUAN LY CUA HANG DIEN THOAI DI DONG


--TAO BANG BAOHANHSP
CREATE TABLE BAOHANHSP(
    MaBH CHAR(5) NOT NULL PRIMARY KEY,
    MaSP CHAR(5),
    NgayBH DATE,
    ChiPhiBH NUMBER,
    MoTaLoi VARCHAR2(100)
);


-------------TAO KHOA NGOAI
ALTER TABLE BAOHANHSP ADD CONSTRAINT FK_BHSP FOREIGN KEY (MASP) REFERENCES SANPHAM(MASP);
