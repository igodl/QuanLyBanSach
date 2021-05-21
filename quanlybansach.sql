-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2021 at 08:57 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlybansach`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Id` int(100) UNSIGNED NOT NULL,
  `User` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Pass` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `HoLot` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Tên` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `NgaySinh` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `GioiTinh` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SoDienThoai` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `PhanQuyen` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TinhTrangHoatDong` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Id`, `User`, `Pass`, `HoLot`, `Tên`, `NgaySinh`, `GioiTinh`, `SoDienThoai`, `PhanQuyen`, `TinhTrangHoatDong`) VALUES
(1, 'admin', 'admin', 'Trương Nhật', 'Vỹ', '2001-09-15', 'Nam', '0814840484', 'Admin', '1'),
(2, 'nhanvien', '1', 'Trương Tú', 'B', '2001-07-22', 'Nam', '07861648234', 'Nhân viên', '1'),
(3, 'khachhang', '1', 'Trương Tú', 'Dạ', '2000-08-25', 'Nam', '07861648234', 'Khách hàng', '1'),
(4, 'nhanvien1', 'truongnhatvY0', 'Trương Tú', 'Z', '2001-07-23', 'Nam', '07861648234', 'Nhân viên', '1'),
(5, 'nhanvien2', 'truongnhatvY0', 'Crương Cú', 'C', '2001-07-23', 'Nam', '07861648234', 'Nhân viên', '1'),
(6, 'nhanvien3', 'truongnhatvY0', 'Trương Tú', 'Lóng', '2001-07-23', 'Nam', '07861648234', 'Nhân viên', '1'),
(7, 'nhanvien4', 'truongnhatvY0', 'Trương Tú', 'A', '2001-07-22', 'Nam', '07861648234', 'Nhân viên', '1'),
(8, 'khachhang1', 'truongnhatvY0', 'Hồ Tùng', 'A', '2001-07-23', 'Nam', '0134856792', 'Khách hàng', '1'),
(9, 'nhanvien5', 'truongnhatvY0', 'Trương Tú', 'U', '2001-07-23', 'Nam', '07861648234', 'Nhân viên', '1'),
(10, 'khachhang99', 'truongnhatvY9', 'Trương Hú', 'Òa', '2001-05-06', 'Nam', '01345796853', 'Khách hàng', '1');

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `MaHoaDon` int(100) UNSIGNED NOT NULL,
  `MaSach` int(100) UNSIGNED NOT NULL,
  `SoLuong` int(100) NOT NULL,
  `DonGia` int(100) NOT NULL,
  `ThanhTien` int(100) NOT NULL,
  `GhiChu` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`MaHoaDon`, `MaSach`, `SoLuong`, `DonGia`, `ThanhTien`, `GhiChu`) VALUES
(1, 1, 2, 90000, 180000, ''),
(1, 8, 1, 99000, 99000, ''),
(1, 16, 1, 56000, 56000, ''),
(2, 1, 2, 90000, 180000, ''),
(2, 8, 1, 99000, 99000, ''),
(2, 16, 1, 56000, 56000, ''),
(2, 13, 1, 90000, 90000, ''),
(2, 19, 1, 45000, 45000, ''),
(2, 24, 1, 78000, 78000, ''),
(3, 1, 2, 90000, 180000, ''),
(3, 8, 1, 99000, 99000, ''),
(3, 16, 1, 56000, 56000, ''),
(3, 13, 1, 90000, 90000, ''),
(3, 19, 1, 45000, 45000, ''),
(3, 24, 1, 78000, 78000, ''),
(3, 21, 3, 90000, 270000, ''),
(3, 15, 5, 103000, 515000, ''),
(3, 10, 2, 150000, 300000, ''),
(4, 21, 2, 90000, 180000, ''),
(4, 20, 2, 70000, 140000, ''),
(5, 1, 6, 90000, 540000, ''),
(6, 1, 6, 90000, 540000, ''),
(7, 1, 30, 90000, 2700000, ''),
(8, 3, 50, 55000, 2750000, ''),
(9, 1, 1, 90000, 90000, ''),
(10, 19, 1, 45000, 45000, '');

-- --------------------------------------------------------

--
-- Table structure for table `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaPhieuNhap` int(100) UNSIGNED NOT NULL,
  `MaSach` int(100) UNSIGNED NOT NULL,
  `SoLuong` int(100) NOT NULL,
  `DonGiaNhap` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`MaPhieuNhap`, `MaSach`, `SoLuong`, `DonGiaNhap`) VALUES
(1, 25, 50, 40000),
(1, 19, 30, 30000),
(2, 13, 50, 20000),
(2, 18, 30, 30000),
(2, 22, 30, 35000),
(3, 21, 25, 23000),
(4, 1, 12, 20000),
(5, 13, 19, 30000);

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `MaHoaDon` int(100) UNSIGNED NOT NULL,
  `MaKhachHang` int(100) UNSIGNED NOT NULL,
  `MaNhanVien` int(100) UNSIGNED NOT NULL,
  `NgayMua` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TongTien` int(100) NOT NULL,
  `TinhTrang` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`MaHoaDon`, `MaKhachHang`, `MaNhanVien`, `NgayMua`, `TongTien`, `TinhTrang`) VALUES
(1, 3, 0, '2021-01-05', 335000, 'Chưa vận chuyển'),
(2, 3, 0, '2021-05-06', 548000, 'Chưa vận chuyển'),
(3, 3, 0, '2021-07-07', 1633000, 'Chưa vận chuyển'),
(4, 8, 0, '2021-10-07', 320000, 'Chưa vận chuyển'),
(5, 3, 0, '2021-05-07', 540000, 'Chưa vận chuyển'),
(6, 8, 0, '2021-05-07', 540000, 'Chưa vận chuyển'),
(7, 8, 0, '2021-05-07', 2700000, 'Chưa vận chuyển'),
(8, 8, 0, '2021-05-07', 2750000, 'Chưa vận chuyển'),
(9, 3, 0, '2021-05-09', 90000, 'Chưa vận chuyển'),
(10, 3, 0, '2021-05-12', 45000, 'Chưa vận chuyển');

-- --------------------------------------------------------

--
-- Table structure for table `loaisach`
--

CREATE TABLE `loaisach` (
  `MaLoai` int(100) UNSIGNED NOT NULL,
  `TenLoai` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `loaisach`
--

INSERT INTO `loaisach` (`MaLoai`, `TenLoai`) VALUES
(1, 'Kinh tế'),
(2, 'Tiểu thuyết'),
(3, 'Giáo trình'),
(4, 'Kĩ năng sống'),
(5, 'Văn học'),
(6, 'Tâm lí'),
(7, 'Kĩ năng sống tốt');

-- --------------------------------------------------------

--
-- Table structure for table `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `MaNCC` int(100) UNSIGNED NOT NULL,
  `TenNCC` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `nhacungcap`
--

INSERT INTO `nhacungcap` (`MaNCC`, `TenNCC`) VALUES
(1, 'Fahasa'),
(2, 'Nhà xuất bản Thuận Hóa Huế'),
(3, 'Công ty cổ phẩn phát hành sách Tp.Hồ Chí Minh'),
(4, 'Công ty TNHH văn hóa Việt Long'),
(5, 'Công ty TNHH Đăng Nguyên'),
(6, 'Công ty cổ phần sách Mcbooks'),
(7, 'Nhà sách Nguyễn Du'),
(8, 'Nhà sách Bích Quân'),
(9, 'Công ty cổ phần sách thiết bị Cà Mau'),
(10, 'Công ty TNHH đầu tư và phát triển Kiwi');

-- --------------------------------------------------------

--
-- Table structure for table `nhaxuatban`
--

CREATE TABLE `nhaxuatban` (
  `MaNXB` int(100) UNSIGNED NOT NULL,
  `TenNXB` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `DiaChi` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SoDienThoai` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `nhaxuatban`
--

INSERT INTO `nhaxuatban` (`MaNXB`, `TenNXB`, `DiaChi`, `SoDienThoai`) VALUES
(1, 'Kim Đồng', '122b', '0123456789'),
(2, 'Nhà xuất bản trẻ', '155a', '0814840484'),
(3, 'Anphabook', '990b', '0127484048'),
(4, 'Nhã Nam', '557u', '0917126612'),
(5, 'Rio Book', '470a', '0777886660'),
(6, 'Sách ĐôngA', '239t', '0133361178'),
(7, 'Đại học Quốc Gia', '9A', '19001878'),
(8, 'Thái Hà', '78c', '19001646'),
(9, '1980s Book', '192d', '0932002054'),
(10, 'Đinh Tị Book', '56d', '18001676');

-- --------------------------------------------------------

--
-- Table structure for table `phieunhap`
--

CREATE TABLE `phieunhap` (
  `MaPhieuNhap` int(100) UNSIGNED NOT NULL,
  `MaNhanVien` int(100) UNSIGNED NOT NULL,
  `NgayNhap` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaNCC` int(100) UNSIGNED NOT NULL,
  `TongTien` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `phieunhap`
--

INSERT INTO `phieunhap` (`MaPhieuNhap`, `MaNhanVien`, `NgayNhap`, `MaNCC`, `TongTien`) VALUES
(1, 1, '2021-05-08', 1, 2900000),
(2, 1, '2021-05-09', 2, 2950000),
(3, 2, '2021-05-10', 3, 575000),
(4, 2, '2021-05-14', 1, 240000),
(5, 4, '2021-05-14', 1, 570000);

-- --------------------------------------------------------

--
-- Table structure for table `sanphamsach`
--

CREATE TABLE `sanphamsach` (
  `MaSach` int(100) UNSIGNED NOT NULL,
  `TenSach` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaLoai` int(10) UNSIGNED NOT NULL,
  `MaTacGia` int(100) UNSIGNED NOT NULL,
  `SoLuong` int(11) NOT NULL,
  `DonGia` int(11) NOT NULL,
  `MaNXB` int(100) UNSIGNED NOT NULL,
  `NgayXuatBan` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TinhTrang` varchar(100) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `sanphamsach`
--

INSERT INTO `sanphamsach` (`MaSach`, `TenSach`, `MaLoai`, `MaTacGia`, `SoLuong`, `DonGia`, `MaNXB`, `NgayXuatBan`, `TinhTrang`) VALUES
(1, 'Khéo ăn khéo nói sẽ có được thiên hạ', 4, 1, 47, 90000, 2, '2020-09-23', 'Còn bán'),
(2, 'Đừng yêu thầm nữa, tỏ tình đi', 2, 10, 36, 60000, 9, '2020-07-04', 'Còn bán'),
(3, 'Vui vẻ không quạo nha', 2, 5, 0, 55000, 5, '2020-06-06', 'Ngưng bán'),
(4, 'Nhà giả kim', 2, 3, 42, 110000, 3, '2020-06-19', 'Còn bán'),
(5, 'Khéo ăn nói bán hàng thành công', 4, 8, 49, 55000, 10, '2020-01-01', 'Còn bán'),
(6, 'Tô Bình Yên Vẽ Hạnh Phúc (Tái Bản 2020)', 5, 2, 50, 75000, 6, '2020-05-05', 'Còn bán'),
(7, 'Đừng chạy theo số đông', 6, 7, 50, 105000, 8, '2020-05-01', 'Còn bán'),
(8, 'Sống tự do không lo âu', 2, 8, 47, 99000, 8, '2020-12-02', 'Còn bán'),
(9, 'GIÁO TRÌNH KỸ THUẬT LẬP TRÌNH C CĂN BẢN & NÂNG CAO', 3, 4, 43, 150000, 7, '2019-01-22', 'Còn bán'),
(10, 'GIÁO TRÌNH C++ VÀ LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG', 3, 4, 47, 150000, 7, '2018-01-02', 'Còn bán'),
(11, 'TỚ HỌC LẬP TRÌNH - LÀM QUEN VỚI PYTHON', 3, 4, 25, 110000, 7, '2018-09-07', 'Còn bán'),
(12, 'Mình Chỉ Là Người Bình Thường', 2, 6, 21, 99000, 5, '2020-11-20', 'Còn bán'),
(13, 'Cho Đi Là Hạnh Phúc', 6, 5, 67, 90000, 5, '2020-10-23', 'Còn bán'),
(14, 'Lạ Lùng Sao, Đớn Đau Này', 2, 9, 50, 70000, 1, '2020-11-27', 'Còn bán'),
(15, 'Sao Em Buồn Đến Thế?', 5, 7, 21, 103000, 10, '2020-01-23', 'Còn bán'),
(16, 'Từ Điển Tiếng “Em”', 6, 6, 47, 56000, 4, '2020-12-21', 'Còn bán'),
(17, 'Thế Giới Này Sẽ Chẳng Có Gì Thay Đổi Kể Cả Khi Bạn Khóc', 2, 7, 54, 99000, 2, '2020-04-14', 'Còn bán'),
(18, 'Cà Phê Cùng Tony', 2, 5, 49, 55000, 2, '2017-09-23', 'Còn bán'),
(19, 'Bay Xuyên Những Tầng Mây', 5, 3, 25, 45000, 5, '2020-02-14', 'Còn bán'),
(20, 'Ngày Trong Sương Mù', 5, 10, 21, 70000, 1, '2020-03-31', 'Còn bán'),
(21, 'Khi Trái Tim Lỗi Nhịp', 2, 10, 19, 90000, 3, '2019-09-23', 'Còn bán'),
(22, 'Có Một Người Từng Là Tất Cả', 2, 1, 22, 73000, 1, '2020-12-12', 'Còn bán'),
(23, 'Quên Một Người Là Chuyện Của Thời Gian', 2, 9, 25, 110000, 3, '2020-02-23', 'Còn bán'),
(24, 'Vui Vẻ Không Quạu Nha 2 - Một Cuốn Sách Buồn… Cười', 6, 8, 28, 78000, 3, '2019-06-29', 'Còn bán'),
(25, 'Ai Rồi Cũng Khác (Tái Bản 2019)', 2, 6, 55, 56000, 4, '2019-06-19', 'Còn bán');

-- --------------------------------------------------------

--
-- Table structure for table `tacgia`
--

CREATE TABLE `tacgia` (
  `MaTacGia` int(100) UNSIGNED NOT NULL,
  `HoLotTacGia` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `TenTacGia` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `tacgia`
--

INSERT INTO `tacgia` (`MaTacGia`, `HoLotTacGia`, `TenTacGia`) VALUES
(1, 'Trác', 'Nhã'),
(2, 'Nguyễn', 'Hiển'),
(3, 'Paulo', 'Coelho'),
(4, 'Đại học', 'FPT'),
(5, 'Ở Đây Dui', 'Nè'),
(6, 'Nguyễn', 'Rosie'),
(7, 'Tống', 'Mặc'),
(8, 'UKI', 'OSHO'),
(9, 'Lê Đỗ Quỳnh', 'Hương'),
(10, 'Trần Minh Phương', 'Thảo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `User` (`User`);

--
-- Indexes for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD KEY `MaHoaDon` (`MaHoaDon`),
  ADD KEY `MaSach` (`MaSach`);

--
-- Indexes for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD KEY `MaPhieuNhap` (`MaPhieuNhap`),
  ADD KEY `MaSach` (`MaSach`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`MaHoaDon`),
  ADD KEY `MaKhachHang` (`MaKhachHang`),
  ADD KEY `MaNhanVien` (`MaNhanVien`);

--
-- Indexes for table `loaisach`
--
ALTER TABLE `loaisach`
  ADD PRIMARY KEY (`MaLoai`);

--
-- Indexes for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`MaNCC`);

--
-- Indexes for table `nhaxuatban`
--
ALTER TABLE `nhaxuatban`
  ADD PRIMARY KEY (`MaNXB`);

--
-- Indexes for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`MaPhieuNhap`),
  ADD KEY `MaNhanVien` (`MaNhanVien`),
  ADD KEY `MaNCC` (`MaNCC`);

--
-- Indexes for table `sanphamsach`
--
ALTER TABLE `sanphamsach`
  ADD PRIMARY KEY (`MaSach`),
  ADD KEY `MaTacGia` (`MaTacGia`),
  ADD KEY `MaLoai` (`MaLoai`),
  ADD KEY `MaNXB` (`MaNXB`),
  ADD KEY `MaNXB_2` (`MaNXB`);

--
-- Indexes for table `tacgia`
--
ALTER TABLE `tacgia`
  ADD PRIMARY KEY (`MaTacGia`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `Id` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `MaHoaDon` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `loaisach`
--
ALTER TABLE `loaisach`
  MODIFY `MaLoai` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `nhacungcap`
--
ALTER TABLE `nhacungcap`
  MODIFY `MaNCC` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `nhaxuatban`
--
ALTER TABLE `nhaxuatban`
  MODIFY `MaNXB` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `MaPhieuNhap` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `sanphamsach`
--
ALTER TABLE `sanphamsach`
  MODIFY `MaSach` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `tacgia`
--
ALTER TABLE `tacgia`
  MODIFY `MaTacGia` int(100) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `chitiethoadon_ibfk_1` FOREIGN KEY (`MaHoaDon`) REFERENCES `hoadon` (`MaHoaDon`),
  ADD CONSTRAINT `chitiethoadon_ibfk_2` FOREIGN KEY (`MaSach`) REFERENCES `sanphamsach` (`MaSach`);

--
-- Constraints for table `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_1` FOREIGN KEY (`MaPhieuNhap`) REFERENCES `phieunhap` (`MaPhieuNhap`),
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`MaSach`) REFERENCES `sanphamsach` (`MaSach`);

--
-- Constraints for table `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`),
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`MaNhanVien`) REFERENCES `account` (`Id`);

--
-- Constraints for table `sanphamsach`
--
ALTER TABLE `sanphamsach`
  ADD CONSTRAINT `sanphamsach_ibfk_1` FOREIGN KEY (`MaTacGia`) REFERENCES `tacgia` (`MaTacGia`),
  ADD CONSTRAINT `sanphamsach_ibfk_2` FOREIGN KEY (`MaLoai`) REFERENCES `loaisach` (`MaLoai`),
  ADD CONSTRAINT `sanphamsach_ibfk_3` FOREIGN KEY (`MaNXB`) REFERENCES `nhaxuatban` (`MaNXB`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
