-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 15, 2022 lúc 02:23 PM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `db_qlbx`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chodexe`
--

CREATE TABLE `chodexe` (
  `ID` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `LoaiChoDe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SoLuongToiDa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `chodexe`
--

INSERT INTO `chodexe` (`ID`, `LoaiChoDe`, `SoLuongToiDa`) VALUES
('01', 'XeMay', 2000),
('02', 'Oto', 1000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `dangkyvethang`
--

CREATE TABLE `dangkyvethang` (
  `ThoiGianDangKy` datetime NOT NULL,
  `SoDienThoai` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `BienSoXe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ThoiGianKetThuc` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `SoDienThoai` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ten` text COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhansu`
--

CREATE TABLE `nhansu` (
  `SoDienThoai` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ten` text COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ChucVu` bit(1) NOT NULL,
  `MatKhau` varchar(30) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhansu`
--

INSERT INTO `nhansu` (`SoDienThoai`, `Ten`, `ChucVu`, `MatKhau`, `ID`) VALUES
('26102002', 'Lê Hồng Sơn', b'1', '123456789', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `suco`
--

CREATE TABLE `suco` (
  `ThoiGianGui` datetime NOT NULL,
  `Loai` text COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MoTa` text COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `IsKhachDenBu` bit(1) NOT NULL,
  `Cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `suco`
--

INSERT INTO `suco` (`ThoiGianGui`, `Loai`, `MoTa`, `IsKhachDenBu`, `Cost`) VALUES
('2022-11-07 09:29:52', 'Hỏng xe của khách', 'Đèn pha xe máy của khách hỏng', b'0', 100000),
('2022-11-08 05:08:43', 'Hỏng cơ sở vật chất', 'Đèn hỏng', b'0', 0),
('2022-11-08 05:22:15', '123', '123', b'0', 123),
('2022-11-08 11:38:21', 'Hỏng Cơ sở vật chất', '123', b'1', 123),
('2022-11-11 16:04:40', 'Hỏng Cơ sở vật chất', 'Khách làm hỏng đèn', b'1', 50000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vengay`
--

CREATE TABLE `vengay` (
  `MaVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `GiaVeNgay` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `vengay`
--

INSERT INTO `vengay` (`MaVe`, `GiaVeNgay`, `TrangThai`) VALUES
('VN0001', 5000, 0),
('VN0002', 5000, 1),
('VN0003', 5000, 0),
('VN0004', 5000, 1),
('VN0005', 5000, 1),
('VN0006', 5000, 1),
('VN0007', 5000, 0),
('VN0008', 5000, 0),
('VN1001', 20000, 0),
('VN1002', 20000, 0),
('VN1003', 20000, 0),
('VN1004', 20000, 0),
('VN1005', 20000, 0),
('VN1006', 20000, 0),
('VN1007', 20000, 0),
('VN1008', 20000, 0),
('VN1009', 20000, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vengaygui`
--

CREATE TABLE `vengaygui` (
  `ThoiGianGui` datetime NOT NULL,
  `IDChoDe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `IDVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `BienSoXe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ThoiGianTra` datetime DEFAULT NULL,
  `Gia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `vengaygui`
--

INSERT INTO `vengaygui` (`ThoiGianGui`, `IDChoDe`, `IDVe`, `BienSoXe`, `ThoiGianTra`, `Gia`) VALUES
('2022-10-31 09:22:33', '01', 'VN0001', 'LHS2610', '2022-11-10 22:19:56', 33000),
('2022-11-10 22:30:12', '01', 'VN0001', 'NDV123', '2022-11-10 22:30:34', 3000),
('2022-11-10 22:30:16', '01', 'VN0002', 'NDV1234', '2022-11-10 22:30:39', 3000),
('2022-11-10 22:31:17', '01', 'VN0001', 'NDV123', '2022-11-10 22:31:33', 3000),
('2022-11-10 22:31:19', '01', 'VN0002', 'NDV123', '2022-11-11 11:02:12', 3000),
('2022-11-10 22:31:22', '01', 'VN0003', 'NDV123', '2022-11-11 11:05:53', 3000),
('2022-11-11 11:04:15', '01', 'VN0001', 'NDV1111', '2022-11-11 14:52:52', 3000),
('2022-11-11 11:55:18', '01', 'VN0002', 'LHS100', '2022-11-11 11:55:53', 3000),
('2022-11-11 14:43:43', '01', 'VN0003', 'SUS6969', '2022-11-11 16:03:27', 3000),
('2022-11-11 14:46:39', '02', 'VN1001', 'SUS9696', '2022-11-11 16:03:06', 20000),
('2022-11-11 14:46:49', '02', 'VN1002', 'AP1156', '2022-11-11 14:50:07', 20000),
('2022-11-11 14:47:04', '02', 'VN1003', 'AP1156', '2022-11-11 14:48:56', 20000),
('2022-11-11 14:51:08', '01', 'VN0002', 'KTHT6789', NULL, 3000),
('2022-11-11 14:51:39', '01', 'VN0004', 'SUSSY-5423', NULL, 3000),
('2022-11-11 14:51:54', '01', 'VN0005', 'LMAO001', NULL, 3000),
('2022-11-11 14:52:12', '01', 'VN0006', 'CNY-37', NULL, 3000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vethang`
--

CREATE TABLE `vethang` (
  `MaVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `GiaVeThang` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `vethang`
--

INSERT INTO `vethang` (`MaVe`, `GiaVeThang`, `TrangThai`) VALUES
('VT0001', 80000, 0),
('VT0002', 80000, 1),
('VT0003', 80000, 0),
('VT0004', 80000, 0),
('VT0005', 80000, 0),
('VT0006', 80000, 0),
('VT0007', 80000, 0),
('VT0008', 80000, 0),
('VT0009', 80000, 0),
('VT0010', 80000, 0),
('VT1001', 580000, 1),
('VT1002', 580000, 0),
('VT1003', 580000, 1),
('VT1004', 580000, 0),
('VT1005', 580000, 0),
('VT1006', 580000, 0),
('VT1007', 580000, 0),
('VT1008', 580000, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vethanggui`
--

CREATE TABLE `vethanggui` (
  `ThoiGianGui` datetime NOT NULL,
  `IDChoDe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `IDVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `BienSoXe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ThoiGianTra` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `vethanggui`
--

INSERT INTO `vethanggui` (`ThoiGianGui`, `IDChoDe`, `IDVe`, `BienSoXe`, `ThoiGianTra`) VALUES
('2022-11-10 03:35:48', '01', 'VT0001', '30A19999', '2022-11-10 21:41:46'),
('2022-11-10 09:49:27', '02', 'VT1001', 'VDD160202', '2022-11-11 09:21:36'),
('2022-11-10 09:51:02', '01', 'VT0001', 'TTD8608', '2022-11-11 16:04:04'),
('2022-11-10 20:57:57', '01', 'VT0002', 'LHS9999', '2022-11-11 09:21:45'),
('2022-11-10 20:58:12', '01', 'VT0003', 'LHS1234', '2022-11-11 11:02:12'),
('2022-11-10 20:58:39', '02', 'VT1002', 'VDD1234', '2022-11-11 16:03:50'),
('2022-11-10 20:59:15', '02', 'VT1003', 'NDV6699', NULL),
('2022-11-11 11:04:43', '02', 'VT1001', 'NDV261', NULL),
('2022-11-11 11:05:01', '01', 'VT0002', 'NDV12', NULL);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chodexe`
--
ALTER TABLE `chodexe`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `dangkyvethang`
--
ALTER TABLE `dangkyvethang`
  ADD PRIMARY KEY (`ThoiGianDangKy`,`SoDienThoai`,`MaVe`),
  ADD KEY `KhoaNgoai_SoDienThoai` (`SoDienThoai`),
  ADD KEY `KhoaNgoai_IDVeThang` (`MaVe`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`SoDienThoai`);

--
-- Chỉ mục cho bảng `nhansu`
--
ALTER TABLE `nhansu`
  ADD PRIMARY KEY (`ID`);

--
-- Chỉ mục cho bảng `suco`
--
ALTER TABLE `suco`
  ADD PRIMARY KEY (`ThoiGianGui`);

--
-- Chỉ mục cho bảng `vengay`
--
ALTER TABLE `vengay`
  ADD PRIMARY KEY (`MaVe`);

--
-- Chỉ mục cho bảng `vengaygui`
--
ALTER TABLE `vengaygui`
  ADD PRIMARY KEY (`ThoiGianGui`,`IDChoDe`,`IDVe`),
  ADD KEY `KhoaNgoai_IDChoDeXe` (`IDChoDe`),
  ADD KEY `KhoaNgoai_IDVe` (`IDVe`);

--
-- Chỉ mục cho bảng `vethang`
--
ALTER TABLE `vethang`
  ADD PRIMARY KEY (`MaVe`);

--
-- Chỉ mục cho bảng `vethanggui`
--
ALTER TABLE `vethanggui`
  ADD PRIMARY KEY (`ThoiGianGui`,`IDChoDe`,`IDVe`),
  ADD KEY `KhoaNgoai_IDChoDeXeThang` (`IDChoDe`),
  ADD KEY `KhoaNgoai_IDGuiVeThang` (`IDVe`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `nhansu`
--
ALTER TABLE `nhansu`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `dangkyvethang`
--
ALTER TABLE `dangkyvethang`
  ADD CONSTRAINT `KhoaNgoai_IDVeThang` FOREIGN KEY (`MaVe`) REFERENCES `vethang` (`MaVe`),
  ADD CONSTRAINT `KhoaNgoai_SoDienThoai` FOREIGN KEY (`SoDienThoai`) REFERENCES `khachhang` (`SoDienThoai`);

--
-- Các ràng buộc cho bảng `vengaygui`
--
ALTER TABLE `vengaygui`
  ADD CONSTRAINT `KhoaNgoai_IDChoDeXe` FOREIGN KEY (`IDChoDe`) REFERENCES `chodexe` (`ID`),
  ADD CONSTRAINT `KhoaNgoai_IDVe` FOREIGN KEY (`IDVe`) REFERENCES `vengay` (`MaVe`);

--
-- Các ràng buộc cho bảng `vethanggui`
--
ALTER TABLE `vethanggui`
  ADD CONSTRAINT `KhoaNgoai_IDChoDeXeThang` FOREIGN KEY (`IDChoDe`) REFERENCES `chodexe` (`ID`),
  ADD CONSTRAINT `KhoaNgoai_IDGuiVeThang` FOREIGN KEY (`IDVe`) REFERENCES `vethang` (`MaVe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
