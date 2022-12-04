-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2022 at 04:20 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_qlbx`
--

-- --------------------------------------------------------

--
-- Table structure for table `chodexe`
--

CREATE TABLE `chodexe` (
  `ID` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `LoaiChoDe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SoLuongToiDa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `chodexe`
--

INSERT INTO `chodexe` (`ID`, `LoaiChoDe`, `SoLuongToiDa`) VALUES
('01', 'XeMay', 2000),
('02', 'Oto', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `dangkyvethang`
--

CREATE TABLE `dangkyvethang` (
  `ID` int(11) NOT NULL,
  `TenKhach` text COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SoDienThoai` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ThoiGianDangKy` datetime NOT NULL,
  `ThoiGianKetThuc` datetime NOT NULL,
  `IDVeThang` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `BienSoXe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `dangkyvethang`
--

INSERT INTO `dangkyvethang` (`ID`, `TenKhach`, `SoDienThoai`, `ThoiGianDangKy`, `ThoiGianKetThuc`, `IDVeThang`, `BienSoXe`) VALUES
(1, 'Lê Văn A', '26102001', '2022-11-27 03:25:41', '2022-12-27 09:25:41', 'VT0001', '30A19999'),
(2, 'Lê Hồng Sơn', '13467154', '2022-09-27 09:31:18', '2022-10-27 09:31:18', 'VT0002', '29A91234'),
(3, 'Lê Xuân Sơn', '46313103', '2022-08-27 10:25:47', '2022-09-27 10:25:47', 'VT0001', '30A11111'),
(4, 'O Sen', '1111', '2022-11-27 09:05:51', '2022-12-27 15:05:51', 'VT0003', '30A103'),
(5, 'Nông Khánh Trang', '9999', '2022-11-27 15:27:19', '2022-12-27 15:27:19', 'VT0004', '30A1243'),
(6, 'Phạm Hoàng Linh', '4967753299', '2022-11-07 09:38:26', '2022-12-07 09:38:26', 'VT1011', '98ghna'),
(7, 'Nguyễn Hữu Sơn', '4971475664', '2022-08-03 10:08:08', '2022-09-03 10:08:08', 'VT1012', 'sadacvvv1'),
(8, 'Lê Hoàng Minh', '9211095289', '2022-07-18 10:08:08', '2022-08-18 10:08:08', 'VT1015', 'ans-442'),
(9, 'Lê Ánh Dương', '5601020984', '2022-10-10 10:10:41', '2022-11-10 10:10:41', 'VT1013', 'BH129-01'),
(10, 'Lê Hoàng Khánh', '6644110699', '2022-06-16 10:10:41', '2022-07-16 10:10:41', 'VT1014', 'sussy-112'),
(11, 'Tạ Lê Khánh', '1180619644', '2022-10-26 10:12:58', '2022-11-26 10:12:58', 'VT0015', '75B61-02'),
(12, 'Đinh Lê Thu Phương', '4637635132', '2022-09-21 10:12:58', '2022-10-21 10:12:58', 'VT0016', 'SUY-V112'),
(13, 'Vương Thùy Dương', '69', '2022-11-27 20:39:29', '2022-12-27 20:39:29', 'VT0005', '69AB'),
(15, 'LHS', '087666', '2022-11-28 19:43:06', '2022-12-28 19:43:06', 'VT0002', '321-sd'),
(16, 'Le Hong Son', '232b-23', '2022-12-03 20:49:41', '2023-01-03 20:49:41', 'VT1010', 'asdas'),
(17, 'Le Hong Son', '2332112', '2022-12-03 20:50:58', '2023-01-03 20:50:58', 'VT1009', 'asdas'),
(18, 'Le Hong Son', '2332112', '2023-01-03 20:50:58', '2023-02-03 20:50:58', 'VT1009', 'asdas'),
(20, 'Thuong', '987671232', '2022-12-03 20:57:03', '2023-01-03 20:57:03', 'VT1007', 'sus-231'),
(21, 'Thuong', '123214444', '2022-12-03 20:58:11', '2023-01-03 20:58:11', 'VT0007', 'sus-231'),
(34, 'Nguyen Van A', '2219987', '2022-09-01 09:00:49', '2022-10-01 09:00:49', 'VT0024', '12009-997'),
(35, 'Nguyen Van A', '2219987', '2022-09-30 09:00:49', '2022-10-30 09:00:49', 'VT0024', '12009-997'),
(41, 'Le Bao Linh', '1231219932', '2022-10-15 21:08:00', '2022-11-15 21:08:00', 'VT0008', '1200ab-997'),
(42, 'Le Bao Linh', '1231219932', '2022-12-03 15:16:27', '2023-01-03 15:16:27', 'VT0008', '87h-30B'),
(43, 'Vạn Phước An', '9127228832', '2022-10-11 09:20:29', '2022-11-11 09:20:29', 'VT0025', '021b-11'),
(44, 'Vạn Phước An', '9127228832', '2022-11-08 09:20:29', '2022-12-08 09:20:29', 'VT0025', '021b-11'),
(45, 'Phạm Hoàng Linh', '4967753299', '2022-12-03 09:38:26', '2023-01-03 09:38:26', 'VT1011', '98ghna'),
(46, 'Lê Hồng Sơn', '13467154', '2022-10-25 09:31:18', '2022-11-25 09:31:18', 'VT0002', '29A91234'),
(47, 'Vương Thùy Dương', '69', '2022-12-25 20:39:29', '2023-01-25 20:39:29', 'VT0005', '69AB'),
(48, 'Vạn Phước An', '9127228832', '2022-12-08 09:20:29', '2023-01-08 09:20:29', 'VT0025', '021b-11'),
(49, 'Lương Triều Vũ', '2112313', '2022-12-04 10:17:54', '2023-01-04 10:17:54', 'VT1014', '80HA-11');

-- --------------------------------------------------------

--
-- Table structure for table `nhansu`
--

CREATE TABLE `nhansu` (
  `SoDienThoai` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `Ten` text COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ChucVu` bit(1) NOT NULL,
  `MatKhau` varchar(30) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `nhansu`
--

INSERT INTO `nhansu` (`SoDienThoai`, `Ten`, `ChucVu`, `MatKhau`, `ID`) VALUES
('26102002', 'Lê Hồng Sơn', b'1', '123456789', 1),
('1', 'Lê Văn A', b'0', '1', 6),
('3', 'Lê Văn B', b'0', '3', 7),
('2', 'Nguyễn Đắc Vượng', b'1', '2', 8);

-- --------------------------------------------------------

--
-- Table structure for table `suco`
--

CREATE TABLE `suco` (
  `ThoiGianGui` datetime NOT NULL,
  `Loai` text COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MoTa` text COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `IsKhachDenBu` bit(1) NOT NULL,
  `Cost` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `suco`
--

INSERT INTO `suco` (`ThoiGianGui`, `Loai`, `MoTa`, `IsKhachDenBu`, `Cost`) VALUES
('2022-11-07 09:29:52', 'Hỏng xe của khách', 'Đèn pha xe máy của khách hỏng', b'0', 100000),
('2022-11-08 05:08:43', 'Hỏng cơ sở vật chất', 'Đèn hỏng', b'0', 0),
('2022-11-08 05:22:15', '123', '123', b'0', 123),
('2022-11-08 11:38:21', 'Hỏng Cơ sở vật chất', '123', b'1', 123),
('2022-11-11 16:04:40', 'Hỏng Cơ sở vật chất', 'Khách làm hỏng đèn', b'1', 50000),
('2022-11-24 12:53:21', 'Hỏng Cơ sở vật chất', 'ẺEVDVF', b'1', 100);

-- --------------------------------------------------------

--
-- Table structure for table `vengay`
--

CREATE TABLE `vengay` (
  `MaVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `GiaVeNgay` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `vengay`
--

INSERT INTO `vengay` (`MaVe`, `GiaVeNgay`, `TrangThai`) VALUES
('VN0001', 5000, 0),
('VN0002', 5000, 0),
('VN0003', 5000, 1),
('VN0004', 5000, 0),
('VN0005', 5000, 0),
('VN0006', 5000, 0),
('VN0007', 5000, 0),
('VN0008', 5000, 0),
('VN0011', 5000, 0),
('VN0012', 5000, 0),
('VN0013', 5000, 0),
('VN0014', 5000, 0),
('VN0015', 5000, 0),
('VN0016', 5000, 0),
('VN0017', 5000, 0),
('VN0018', 5000, 0),
('VN0019', 5000, 0),
('VN0020', 5000, 0),
('VN0021', 5000, 0),
('VN0022', 5000, 0),
('VN0023', 5000, 0),
('VN0024', 5000, 0),
('VN0025', 5000, 0),
('VN0026', 5000, 0),
('VN0027', 5000, 0),
('VN0028', 5000, 0),
('VN0029', 5000, 0),
('VN0030', 5000, 0),
('VN0031', 5000, 0),
('VN0032', 5000, 0),
('VN0033', 5000, 0),
('VN0034', 5000, 0),
('VN0035', 5000, 0),
('VN0036', 5000, 0),
('VN0037', 5000, 0),
('VN0038', 5000, 0),
('VN0039', 5000, 0),
('VN0040', 5000, 0),
('VN0041', 5000, 0),
('VN0042', 5000, 0),
('VN0043', 5000, 0),
('VN0044', 5000, 0),
('VN0045', 5000, 0),
('VN0046', 5000, 0),
('VN0047', 5000, 0),
('VN0048', 5000, 0),
('VN0049', 5000, 0),
('VN0050', 5000, 0),
('VN0051', 5000, 0),
('VN0052', 5000, 0),
('VN0053', 5000, 0),
('VN0054', 5000, 0),
('VN0055', 5000, 0),
('VN0056', 5000, 0),
('VN0057', 5000, 0),
('VN0058', 5000, 0),
('VN0059', 5000, 0),
('VN0060', 5000, 0),
('VN0061', 5000, 0),
('VN0062', 5000, 0),
('VN0063', 5000, 0),
('VN0064', 5000, 0),
('VN0065', 5000, 0),
('VN0066', 5000, 0),
('VN0067', 5000, 0),
('VN0068', 5000, 0),
('VN0069', 5000, 0),
('VN0070', 5000, 0),
('VN0071', 5000, 0),
('VN0072', 5000, 0),
('VN0073', 5000, 0),
('VN0074', 5000, 0),
('VN0075', 5000, 0),
('VN0076', 5000, 0),
('VN0077', 5000, 0),
('VN0078', 5000, 0),
('VN0079', 5000, 0),
('VN0080', 5000, 0),
('VN0081', 5000, 0),
('VN0082', 5000, 0),
('VN0083', 5000, 0),
('VN0084', 5000, 0),
('VN0085', 5000, 0),
('VN0086', 5000, 0),
('VN0087', 5000, 0),
('VN0088', 5000, 0),
('VN0089', 5000, 0),
('VN0090', 5000, 0),
('VN0091', 5000, 0),
('VN0092', 5000, 0),
('VN0093', 5000, 0),
('VN0094', 5000, 0),
('VN0095', 5000, 0),
('VN0096', 5000, 0),
('VN0097', 5000, 0),
('VN0098', 5000, 0),
('VN0099', 5000, 0),
('VN1001', 20000, 0),
('VN1002', 20000, 0),
('VN1003', 20000, 0),
('VN1004', 20000, 0),
('VN1005', 20000, 0),
('VN1006', 20000, 0),
('VN1007', 20000, 0),
('VN1008', 20000, 0),
('VN1009', 20000, 0),
('VN1011', 20000, 0),
('VN1012', 20000, 0),
('VN1013', 20000, 0),
('VN1014', 20000, 0),
('VN1015', 20000, 0),
('VN1016', 20000, 0),
('VN1017', 20000, 0),
('VN1018', 20000, 0),
('VN1019', 20000, 0),
('VN1020', 20000, 0),
('VN1021', 20000, 0),
('VN1022', 20000, 0),
('VN1023', 20000, 0),
('VN1024', 20000, 0),
('VN1025', 20000, 0),
('VN1026', 20000, 0),
('VN1027', 20000, 0),
('VN1028', 20000, 0),
('VN1029', 20000, 0),
('VN1030', 20000, 0),
('VN1031', 20000, 0),
('VN1032', 20000, 0),
('VN1033', 20000, 0),
('VN1034', 20000, 0),
('VN1035', 20000, 0),
('VN1036', 20000, 0),
('VN1037', 20000, 0),
('VN1038', 20000, 0),
('VN1039', 20000, 0),
('VN1040', 20000, 0),
('VN1041', 20000, 0),
('VN1042', 20000, 0),
('VN1043', 20000, 0),
('VN1044', 20000, 0),
('VN1045', 20000, 0),
('VN1046', 20000, 0),
('VN1047', 20000, 0),
('VN1048', 20000, 0),
('VN1049', 20000, 0),
('VN1050', 20000, 0),
('VN1051', 20000, 0),
('VN1052', 20000, 0),
('VN1053', 20000, 0),
('VN1054', 20000, 0),
('VN1055', 20000, 0),
('VN1056', 20000, 0),
('VN1057', 20000, 0),
('VN1058', 20000, 0),
('VN1059', 20000, 0),
('VN1060', 20000, 0),
('VN1061', 20000, 0),
('VN1062', 20000, 0),
('VN1063', 20000, 0),
('VN1064', 20000, 0),
('VN1065', 20000, 0),
('VN1066', 20000, 0),
('VN1067', 20000, 0),
('VN1068', 20000, 0),
('VN1069', 20000, 0),
('VN1070', 20000, 0),
('VN1071', 20000, 0),
('VN1072', 20000, 0),
('VN1073', 20000, 0),
('VN1074', 20000, 0),
('VN1075', 20000, 0),
('VN1076', 20000, 0),
('VN1077', 20000, 0),
('VN1078', 20000, 0),
('VN1079', 20000, 0),
('VN1080', 20000, 0),
('VN1081', 20000, 0),
('VN1082', 20000, 0),
('VN1083', 20000, 0),
('VN1084', 20000, 0),
('VN1085', 20000, 0),
('VN1086', 20000, 0),
('VN1087', 20000, 0),
('VN1088', 20000, 0),
('VN1089', 20000, 0),
('VN1090', 20000, 0),
('VN1091', 20000, 0),
('VN1092', 20000, 0),
('VN1093', 20000, 0),
('VN1094', 20000, 0),
('VN1095', 20000, 0),
('VN1096', 20000, 0),
('VN1097', 20000, 0),
('VN1098', 20000, 0),
('VN1099', 20000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `vengaygui`
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
-- Dumping data for table `vengaygui`
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
('2022-11-11 14:51:08', '01', 'VN0002', 'KTHT6789', '2022-11-24 12:52:38', 39000),
('2022-11-11 14:51:39', '01', 'VN0004', 'SUSSY-5423', '2022-11-28 09:59:07', 51000),
('2022-11-11 14:51:54', '01', 'VN0005', 'LMAO001', '2022-11-28 09:59:18', 51000),
('2022-11-11 14:52:12', '01', 'VN0006', 'CNY-37', '2022-11-28 09:59:16', 51000),
('2022-11-23 10:33:16', '01', 'VN0001', '29B19999', '2022-11-28 09:59:20', 15000),
('2022-11-23 12:42:10', '01', 'VN0003', 'aASCF12', '2022-11-28 09:59:21', 15000),
('2022-12-03 20:55:06', '01', 'VN0007', '2321-3232', '2022-12-03 20:55:58', 3000),
('2022-12-03 20:55:14', '01', 'VN0003', '232b-sds', NULL, 3000),
('2022-12-03 20:55:23', '01', 'VN0001', 'sdsda-2321', '2022-12-03 20:55:56', 3000),
('2022-12-03 20:55:44', '02', 'VN1001', 'sda-q232', '2022-12-03 20:56:06', 20000);

-- --------------------------------------------------------

--
-- Table structure for table `vethang`
--

CREATE TABLE `vethang` (
  `MaVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `GiaVeThang` int(11) NOT NULL,
  `TrangThai` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `vethang`
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
('VT0011', 80000, 0),
('VT0012', 80000, 0),
('VT0013', 80000, 0),
('VT0014', 80000, 0),
('VT0015', 80000, 0),
('VT0016', 80000, 0),
('VT0017', 80000, 0),
('VT0018', 80000, 0),
('VT0019', 80000, 0),
('VT0020', 80000, 0),
('VT0021', 80000, 0),
('VT0022', 80000, 0),
('VT0023', 80000, 0),
('VT0024', 80000, 0),
('VT0025', 80000, 0),
('VT0026', 80000, 0),
('VT0027', 80000, 0),
('VT0028', 80000, 0),
('VT0029', 80000, 0),
('VT0030', 80000, 0),
('VT0031', 80000, 0),
('VT0032', 80000, 0),
('VT0033', 80000, 0),
('VT0034', 80000, 0),
('VT0035', 80000, 0),
('VT0036', 80000, 0),
('VT0037', 80000, 0),
('VT0038', 80000, 0),
('VT0039', 80000, 0),
('VT0040', 80000, 0),
('VT0041', 80000, 0),
('VT0042', 80000, 0),
('VT0043', 80000, 0),
('VT0044', 80000, 0),
('VT0045', 80000, 0),
('VT0046', 80000, 0),
('VT0047', 80000, 0),
('VT0048', 80000, 0),
('VT0049', 80000, 0),
('VT0050', 80000, 0),
('VT0051', 80000, 0),
('VT0052', 80000, 0),
('VT0053', 80000, 0),
('VT0054', 80000, 0),
('VT0055', 80000, 0),
('VT0056', 80000, 0),
('VT0057', 80000, 0),
('VT0058', 80000, 0),
('VT0059', 80000, 0),
('VT0060', 80000, 0),
('VT0061', 80000, 0),
('VT0062', 80000, 0),
('VT0063', 80000, 0),
('VT0064', 80000, 0),
('VT0065', 80000, 0),
('VT0066', 80000, 0),
('VT0067', 80000, 0),
('VT0068', 80000, 0),
('VT0069', 80000, 0),
('VT0070', 80000, 0),
('VT0071', 80000, 0),
('VT0072', 80000, 0),
('VT0073', 80000, 0),
('VT0074', 80000, 0),
('VT0075', 80000, 0),
('VT0076', 80000, 0),
('VT0077', 80000, 0),
('VT0078', 80000, 0),
('VT0079', 80000, 0),
('VT0080', 80000, 0),
('VT0081', 80000, 0),
('VT0082', 80000, 0),
('VT0083', 80000, 0),
('VT0084', 80000, 0),
('VT0085', 80000, 0),
('VT0086', 80000, 0),
('VT0087', 80000, 0),
('VT0088', 80000, 0),
('VT0089', 80000, 0),
('VT0090', 80000, 0),
('VT0091', 80000, 0),
('VT0092', 80000, 0),
('VT0093', 80000, 0),
('VT0094', 80000, 0),
('VT0095', 80000, 0),
('VT0096', 80000, 0),
('VT0097', 80000, 0),
('VT0098', 80000, 0),
('VT0099', 80000, 0),
('VT1001', 580000, 0),
('VT1002', 580000, 0),
('VT1003', 580000, 0),
('VT1004', 580000, 0),
('VT1005', 580000, 0),
('VT1006', 580000, 0),
('VT1007', 580000, 0),
('VT1008', 580000, 0),
('VT1009', 580000, 0),
('VT1010', 580000, 0),
('VT1011', 580000, 0),
('VT1012', 580000, 0),
('VT1013', 580000, 0),
('VT1014', 580000, 0),
('VT1015', 580000, 0),
('VT1016', 580000, 0),
('VT1017', 580000, 0),
('VT1018', 580000, 0),
('VT1019', 580000, 0),
('VT1020', 580000, 0),
('VT1021', 580000, 0),
('VT1022', 580000, 0),
('VT1023', 580000, 0),
('VT1024', 580000, 0),
('VT1025', 580000, 0),
('VT1026', 580000, 0),
('VT1027', 580000, 0),
('VT1028', 580000, 0),
('VT1029', 580000, 0),
('VT1030', 580000, 0),
('VT1031', 580000, 0),
('VT1032', 580000, 0),
('VT1033', 580000, 0),
('VT1034', 580000, 0),
('VT1035', 580000, 0),
('VT1036', 580000, 0),
('VT1037', 580000, 0),
('VT1038', 580000, 0),
('VT1039', 580000, 0),
('VT1040', 580000, 0),
('VT1041', 580000, 0),
('VT1042', 580000, 0),
('VT1043', 580000, 0),
('VT1044', 580000, 0),
('VT1045', 580000, 0),
('VT1046', 580000, 0),
('VT1047', 580000, 0),
('VT1048', 580000, 0),
('VT1049', 580000, 0),
('VT1050', 580000, 0),
('VT1051', 580000, 0),
('VT1052', 580000, 0),
('VT1053', 580000, 0),
('VT1054', 580000, 0),
('VT1055', 580000, 0),
('VT1056', 580000, 0),
('VT1057', 580000, 0),
('VT1058', 580000, 0),
('VT1059', 580000, 0),
('VT1060', 580000, 0),
('VT1061', 580000, 0),
('VT1062', 580000, 0),
('VT1063', 580000, 0),
('VT1064', 580000, 0),
('VT1065', 580000, 0),
('VT1066', 580000, 0),
('VT1067', 580000, 0),
('VT1068', 580000, 0),
('VT1069', 580000, 0),
('VT1070', 580000, 0),
('VT1071', 580000, 0),
('VT1072', 580000, 0),
('VT1073', 580000, 0),
('VT1074', 580000, 0),
('VT1075', 580000, 0),
('VT1076', 580000, 0),
('VT1077', 580000, 0),
('VT1078', 580000, 0),
('VT1079', 580000, 0),
('VT1080', 580000, 0),
('VT1081', 580000, 0),
('VT1082', 580000, 0),
('VT1083', 580000, 0),
('VT1084', 580000, 0),
('VT1085', 580000, 0),
('VT1086', 580000, 0),
('VT1087', 580000, 0),
('VT1088', 580000, 0),
('VT1089', 580000, 0),
('VT1090', 580000, 0),
('VT1091', 580000, 0),
('VT1092', 580000, 0),
('VT1093', 580000, 0),
('VT1094', 580000, 0),
('VT1095', 580000, 0),
('VT1096', 580000, 0),
('VT1097', 580000, 0),
('VT1098', 580000, 0),
('VT1099', 580000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `vethanggui`
--

CREATE TABLE `vethanggui` (
  `ThoiGianGui` datetime NOT NULL,
  `IDChoDe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `IDVe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `BienSoXe` varchar(10) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ThoiGianTra` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Dumping data for table `vethanggui`
--

INSERT INTO `vethanggui` (`ThoiGianGui`, `IDChoDe`, `IDVe`, `BienSoXe`, `ThoiGianTra`) VALUES
('2022-11-10 03:35:48', '01', 'VT0001', '0', '2022-11-10 21:41:46'),
('2022-11-10 09:49:27', '02', 'VT1001', '0', '2022-11-11 09:21:36'),
('2022-11-10 09:51:02', '01', 'VT0001', '0', '2022-11-11 16:04:04'),
('2022-11-10 20:57:57', '01', 'VT0002', '0', '2022-11-11 09:21:45'),
('2022-11-10 20:58:12', '01', 'VT0003', '0', '2022-11-11 11:02:12'),
('2022-11-10 20:58:39', '02', 'VT1002', '0', '2022-11-11 16:03:50'),
('2022-11-10 20:59:15', '02', 'VT1003', '0', '2022-11-27 09:25:08'),
('2022-11-11 11:04:43', '02', 'VT1001', '0', '2022-11-24 10:05:16'),
('2022-11-11 11:05:01', '01', 'VT0002', '0', '2022-11-27 09:25:09'),
('2022-11-23 10:34:37', '02', 'VT1002', '0', '2022-11-27 09:25:11'),
('2022-11-23 12:41:17', '02', 'VT1004', '0', '2022-11-27 09:25:13'),
('2022-11-24 10:05:52', '02', 'VT1001', '0', '2022-11-24 12:52:20'),
('2022-11-27 10:28:00', '01', 'VT0001', '', '2022-11-27 10:45:38'),
('2022-11-27 10:45:52', '01', 'VT0001', '30A19999', '2022-11-27 10:46:01'),
('2022-11-27 16:38:59', '01', 'VT0001', '30A19999', '2022-11-27 16:39:10'),
('2022-11-27 20:45:50', '01', 'VT0005', '69AB', '2022-11-27 20:46:03'),
('2022-11-27 20:54:41', '01', 'VT0001', '30A19999', '2022-11-27 20:57:57'),
('2022-11-27 20:58:07', '01', 'VT0001', '30A19999', '2022-11-28 09:58:59');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chodexe`
--
ALTER TABLE `chodexe`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `dangkyvethang`
--
ALTER TABLE `dangkyvethang`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `KhoaNgoai_IDVeThang` (`IDVeThang`);

--
-- Indexes for table `nhansu`
--
ALTER TABLE `nhansu`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `suco`
--
ALTER TABLE `suco`
  ADD PRIMARY KEY (`ThoiGianGui`);

--
-- Indexes for table `vengay`
--
ALTER TABLE `vengay`
  ADD PRIMARY KEY (`MaVe`);

--
-- Indexes for table `vengaygui`
--
ALTER TABLE `vengaygui`
  ADD PRIMARY KEY (`ThoiGianGui`,`IDChoDe`,`IDVe`),
  ADD KEY `KhoaNgoai_IDChoDeXe` (`IDChoDe`),
  ADD KEY `KhoaNgoai_IDVe` (`IDVe`);

--
-- Indexes for table `vethang`
--
ALTER TABLE `vethang`
  ADD PRIMARY KEY (`MaVe`);

--
-- Indexes for table `vethanggui`
--
ALTER TABLE `vethanggui`
  ADD PRIMARY KEY (`ThoiGianGui`,`IDChoDe`,`IDVe`),
  ADD KEY `KhoaNgoai_IDChoDeXeThang` (`IDChoDe`),
  ADD KEY `KhoaNgoai_IDGuiVeThang` (`IDVe`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dangkyvethang`
--
ALTER TABLE `dangkyvethang`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `nhansu`
--
ALTER TABLE `nhansu`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `dangkyvethang`
--
ALTER TABLE `dangkyvethang`
  ADD CONSTRAINT `KhoaNgoai_IDVeThang` FOREIGN KEY (`IDVeThang`) REFERENCES `vethang` (`MaVe`);

--
-- Constraints for table `vengaygui`
--
ALTER TABLE `vengaygui`
  ADD CONSTRAINT `KhoaNgoai_IDChoDeXe` FOREIGN KEY (`IDChoDe`) REFERENCES `chodexe` (`ID`),
  ADD CONSTRAINT `KhoaNgoai_IDVe` FOREIGN KEY (`IDVe`) REFERENCES `vengay` (`MaVe`);

--
-- Constraints for table `vethanggui`
--
ALTER TABLE `vethanggui`
  ADD CONSTRAINT `KhoaNgoai_IDChoDeXeThang` FOREIGN KEY (`IDChoDe`) REFERENCES `chodexe` (`ID`),
  ADD CONSTRAINT `KhoaNgoai_IDGuiVeThang` FOREIGN KEY (`IDVe`) REFERENCES `vethang` (`MaVe`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
