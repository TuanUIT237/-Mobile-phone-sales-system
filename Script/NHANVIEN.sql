--DATABASE QUAN LY CUA HANG DIEN THOAI DI DONG

-- TAO BANG NHAN VIEN
CREATE TABLE NHANVIEN(
    MaNV CHAR(5) NOT NULL PRIMARY KEY,
    HoTen VARCHAR2(30),
    GioiTinh NUMBER,
    CMND VARCHAR2(20),
    DiaChi VARCHAR2(200),
    Email VARCHAR2(100),
    SDT VARCHAR2(10),
    SoNgayLam NUMBER,
    MaPB CHAR(5)
);



-------------TAO KHOA NGOAI
ALTER TABLE NHANVIEN ADD CONSTRAINT FK_NVPB FOREIGN KEY (MaPB) REFERENCES PHONGBAN(MaPB);