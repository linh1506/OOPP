-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 23, 2022 lúc 04:38 AM
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
CREATE DATABASE IF NOT EXISTS `db_qlbx` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci;
USE `db_qlbx`;

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
('26102002', 'Lê Hồng Sơn', b'1', '123456789', 1),
('1', 'Lê Văn A', b'0', '1', 6),
('3', 'Lê Văn B', b'0', '3', 7),
('2', 'Nguyễn Đắc Vượng', b'1', '2', 8);

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
('VN0001', 5000, 1),
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
('2022-11-11 14:52:12', '01', 'VN0006', 'CNY-37', NULL, 3000),
('2022-11-23 10:33:16', '01', 'VN0001', '29B19999', NULL, 3000);

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
('VT1002', 580000, 1),
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
('2022-11-11 11:05:01', '01', 'VT0002', 'NDV12', NULL),
('2022-11-23 10:34:37', '02', 'VT1002', '97B99292', NULL);

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
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

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
--
-- Cơ sở dữ liệu: `phpmyadmin`
--
CREATE DATABASE IF NOT EXISTS `phpmyadmin` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `phpmyadmin`;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__bookmark`
--

CREATE TABLE `pma__bookmark` (
  `id` int(10) UNSIGNED NOT NULL,
  `dbase` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `user` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `label` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `query` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Bookmarks';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__central_columns`
--

CREATE TABLE `pma__central_columns` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_length` text COLLATE utf8_bin DEFAULT NULL,
  `col_collation` varchar(64) COLLATE utf8_bin NOT NULL,
  `col_isNull` tinyint(1) NOT NULL,
  `col_extra` varchar(255) COLLATE utf8_bin DEFAULT '',
  `col_default` text COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Central list of columns';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__column_info`
--

CREATE TABLE `pma__column_info` (
  `id` int(5) UNSIGNED NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `column_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `mimetype` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '',
  `input_transformation_options` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Column information for phpMyAdmin';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__designer_settings`
--

CREATE TABLE `pma__designer_settings` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `settings_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Settings related to Designer';

--
-- Đang đổ dữ liệu cho bảng `pma__designer_settings`
--

INSERT INTO `pma__designer_settings` (`username`, `settings_data`) VALUES
('root', '{\"snap_to_grid\":\"off\",\"relation_lines\":\"true\",\"angular_direct\":\"direct\"}');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__export_templates`
--

CREATE TABLE `pma__export_templates` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `export_type` varchar(10) COLLATE utf8_bin NOT NULL,
  `template_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `template_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved export templates';

--
-- Đang đổ dữ liệu cho bảng `pma__export_templates`
--

INSERT INTO `pma__export_templates` (`id`, `username`, `export_type`, `template_name`, `template_data`) VALUES
(1, 'root', 'database', 'son', '{\"quick_or_custom\":\"quick\",\"what\":\"sql\",\"structure_or_data_forced\":\"0\",\"table_select[]\":[\"admin\",\"areaparking\",\"financial_report\",\"hibernate_sequence\",\"parking_slot\",\"ticket\",\"user\",\"vehicle\"],\"table_structure[]\":[\"admin\",\"areaparking\",\"financial_report\",\"hibernate_sequence\",\"parking_slot\",\"ticket\",\"user\",\"vehicle\"],\"table_data[]\":[\"admin\",\"areaparking\",\"financial_report\",\"hibernate_sequence\",\"parking_slot\",\"ticket\",\"user\",\"vehicle\"],\"aliases_new\":\"\",\"output_format\":\"sendit\",\"filename_template\":\"@DATABASE@\",\"remember_template\":\"on\",\"charset\":\"utf-8\",\"compression\":\"none\",\"maxsize\":\"\",\"codegen_structure_or_data\":\"data\",\"codegen_format\":\"0\",\"csv_separator\":\",\",\"csv_enclosed\":\"\\\"\",\"csv_escaped\":\"\\\"\",\"csv_terminated\":\"AUTO\",\"csv_null\":\"NULL\",\"csv_structure_or_data\":\"data\",\"excel_null\":\"NULL\",\"excel_columns\":\"something\",\"excel_edition\":\"win\",\"excel_structure_or_data\":\"data\",\"json_structure_or_data\":\"data\",\"json_unicode\":\"something\",\"latex_caption\":\"something\",\"latex_structure_or_data\":\"structure_and_data\",\"latex_structure_caption\":\"Cấu trúc của bảng @TABLE@\",\"latex_structure_continued_caption\":\"Cấu trúc của bảng @TABLE@ (còn nữa)\",\"latex_structure_label\":\"tab:@TABLE@-structure\",\"latex_relation\":\"something\",\"latex_comments\":\"something\",\"latex_mime\":\"something\",\"latex_columns\":\"something\",\"latex_data_caption\":\"Nội dung của bảng @TABLE@\",\"latex_data_continued_caption\":\"Nội dung của bảng @TABLE@ (còn nữa)\",\"latex_data_label\":\"tab:@TABLE@-data\",\"latex_null\":\"\\\\textit{NULL}\",\"mediawiki_structure_or_data\":\"structure_and_data\",\"mediawiki_caption\":\"something\",\"mediawiki_headers\":\"something\",\"htmlword_structure_or_data\":\"structure_and_data\",\"htmlword_null\":\"NULL\",\"ods_null\":\"NULL\",\"ods_structure_or_data\":\"data\",\"odt_structure_or_data\":\"structure_and_data\",\"odt_relation\":\"something\",\"odt_comments\":\"something\",\"odt_mime\":\"something\",\"odt_columns\":\"something\",\"odt_null\":\"NULL\",\"pdf_report_title\":\"\",\"pdf_structure_or_data\":\"structure_and_data\",\"phparray_structure_or_data\":\"data\",\"sql_include_comments\":\"something\",\"sql_header_comment\":\"\",\"sql_use_transaction\":\"something\",\"sql_compatibility\":\"NONE\",\"sql_structure_or_data\":\"structure_and_data\",\"sql_create_table\":\"something\",\"sql_auto_increment\":\"something\",\"sql_create_view\":\"something\",\"sql_procedure_function\":\"something\",\"sql_create_trigger\":\"something\",\"sql_backquotes\":\"something\",\"sql_type\":\"INSERT\",\"sql_insert_syntax\":\"both\",\"sql_max_query_size\":\"50000\",\"sql_hex_for_binary\":\"something\",\"sql_utc_time\":\"something\",\"texytext_structure_or_data\":\"structure_and_data\",\"texytext_null\":\"NULL\",\"xml_structure_or_data\":\"data\",\"xml_export_events\":\"something\",\"xml_export_functions\":\"something\",\"xml_export_procedures\":\"something\",\"xml_export_tables\":\"something\",\"xml_export_triggers\":\"something\",\"xml_export_views\":\"something\",\"xml_export_contents\":\"something\",\"yaml_structure_or_data\":\"data\",\"\":null,\"lock_tables\":null,\"as_separate_files\":null,\"csv_removeCRLF\":null,\"csv_columns\":null,\"excel_removeCRLF\":null,\"json_pretty_print\":null,\"htmlword_columns\":null,\"ods_columns\":null,\"sql_dates\":null,\"sql_relation\":null,\"sql_mime\":null,\"sql_disable_fk\":null,\"sql_views_as_tables\":null,\"sql_metadata\":null,\"sql_create_database\":null,\"sql_drop_table\":null,\"sql_if_not_exists\":null,\"sql_simple_view_export\":null,\"sql_view_current_user\":null,\"sql_or_replace_view\":null,\"sql_truncate\":null,\"sql_delayed\":null,\"sql_ignore\":null,\"texytext_columns\":null}'),
(2, 'root', 'database', 'DB1', '{\"quick_or_custom\":\"quick\",\"what\":\"sql\",\"structure_or_data_forced\":\"0\",\"table_select[]\":[\"admin\",\"areaparking\",\"financial_report\",\"hibernate_sequence\",\"ticket\",\"user\",\"vehicle\"],\"table_structure[]\":[\"admin\",\"areaparking\",\"financial_report\",\"hibernate_sequence\",\"ticket\",\"user\",\"vehicle\"],\"table_data[]\":[\"admin\",\"areaparking\",\"financial_report\",\"hibernate_sequence\",\"ticket\",\"user\",\"vehicle\"],\"aliases_new\":\"\",\"output_format\":\"sendit\",\"filename_template\":\"@DATABASE@\",\"remember_template\":\"on\",\"charset\":\"utf-8\",\"compression\":\"none\",\"maxsize\":\"\",\"codegen_structure_or_data\":\"data\",\"codegen_format\":\"0\",\"csv_separator\":\",\",\"csv_enclosed\":\"\\\"\",\"csv_escaped\":\"\\\"\",\"csv_terminated\":\"AUTO\",\"csv_null\":\"NULL\",\"csv_structure_or_data\":\"data\",\"excel_null\":\"NULL\",\"excel_columns\":\"something\",\"excel_edition\":\"win\",\"excel_structure_or_data\":\"data\",\"json_structure_or_data\":\"data\",\"json_unicode\":\"something\",\"latex_caption\":\"something\",\"latex_structure_or_data\":\"structure_and_data\",\"latex_structure_caption\":\"Cấu trúc của bảng @TABLE@\",\"latex_structure_continued_caption\":\"Cấu trúc của bảng @TABLE@ (còn nữa)\",\"latex_structure_label\":\"tab:@TABLE@-structure\",\"latex_relation\":\"something\",\"latex_comments\":\"something\",\"latex_mime\":\"something\",\"latex_columns\":\"something\",\"latex_data_caption\":\"Nội dung của bảng @TABLE@\",\"latex_data_continued_caption\":\"Nội dung của bảng @TABLE@ (còn nữa)\",\"latex_data_label\":\"tab:@TABLE@-data\",\"latex_null\":\"\\\\textit{NULL}\",\"mediawiki_structure_or_data\":\"structure_and_data\",\"mediawiki_caption\":\"something\",\"mediawiki_headers\":\"something\",\"htmlword_structure_or_data\":\"structure_and_data\",\"htmlword_null\":\"NULL\",\"ods_null\":\"NULL\",\"ods_structure_or_data\":\"data\",\"odt_structure_or_data\":\"structure_and_data\",\"odt_relation\":\"something\",\"odt_comments\":\"something\",\"odt_mime\":\"something\",\"odt_columns\":\"something\",\"odt_null\":\"NULL\",\"pdf_report_title\":\"\",\"pdf_structure_or_data\":\"structure_and_data\",\"phparray_structure_or_data\":\"data\",\"sql_include_comments\":\"something\",\"sql_header_comment\":\"\",\"sql_use_transaction\":\"something\",\"sql_compatibility\":\"NONE\",\"sql_structure_or_data\":\"structure_and_data\",\"sql_create_table\":\"something\",\"sql_auto_increment\":\"something\",\"sql_create_view\":\"something\",\"sql_procedure_function\":\"something\",\"sql_create_trigger\":\"something\",\"sql_backquotes\":\"something\",\"sql_type\":\"INSERT\",\"sql_insert_syntax\":\"both\",\"sql_max_query_size\":\"50000\",\"sql_hex_for_binary\":\"something\",\"sql_utc_time\":\"something\",\"texytext_structure_or_data\":\"structure_and_data\",\"texytext_null\":\"NULL\",\"xml_structure_or_data\":\"data\",\"xml_export_events\":\"something\",\"xml_export_functions\":\"something\",\"xml_export_procedures\":\"something\",\"xml_export_tables\":\"something\",\"xml_export_triggers\":\"something\",\"xml_export_views\":\"something\",\"xml_export_contents\":\"something\",\"yaml_structure_or_data\":\"data\",\"\":null,\"lock_tables\":null,\"as_separate_files\":null,\"csv_removeCRLF\":null,\"csv_columns\":null,\"excel_removeCRLF\":null,\"json_pretty_print\":null,\"htmlword_columns\":null,\"ods_columns\":null,\"sql_dates\":null,\"sql_relation\":null,\"sql_mime\":null,\"sql_disable_fk\":null,\"sql_views_as_tables\":null,\"sql_metadata\":null,\"sql_create_database\":null,\"sql_drop_table\":null,\"sql_if_not_exists\":null,\"sql_simple_view_export\":null,\"sql_view_current_user\":null,\"sql_or_replace_view\":null,\"sql_truncate\":null,\"sql_delayed\":null,\"sql_ignore\":null,\"texytext_columns\":null}'),
(3, 'root', 'database', 'DataQLBX', '{\"quick_or_custom\":\"quick\",\"what\":\"sql\",\"structure_or_data_forced\":\"0\",\"table_select[]\":[\"chodexe\",\"dangkyvethang\",\"khachhang\",\"nhansu\",\"suco\",\"vengay\",\"vengaygui\",\"vethang\",\"vethanggui\"],\"table_structure[]\":[\"chodexe\",\"dangkyvethang\",\"khachhang\",\"nhansu\",\"suco\",\"vengay\",\"vengaygui\",\"vethang\",\"vethanggui\"],\"table_data[]\":[\"chodexe\",\"dangkyvethang\",\"khachhang\",\"nhansu\",\"suco\",\"vengay\",\"vengaygui\",\"vethang\",\"vethanggui\"],\"aliases_new\":\"\",\"output_format\":\"sendit\",\"filename_template\":\"@DATABASE@\",\"remember_template\":\"on\",\"charset\":\"utf-8\",\"compression\":\"none\",\"maxsize\":\"\",\"codegen_structure_or_data\":\"data\",\"codegen_format\":\"0\",\"csv_separator\":\",\",\"csv_enclosed\":\"\\\"\",\"csv_escaped\":\"\\\"\",\"csv_terminated\":\"AUTO\",\"csv_null\":\"NULL\",\"csv_structure_or_data\":\"data\",\"excel_null\":\"NULL\",\"excel_columns\":\"something\",\"excel_edition\":\"win\",\"excel_structure_or_data\":\"data\",\"json_structure_or_data\":\"data\",\"json_unicode\":\"something\",\"latex_caption\":\"something\",\"latex_structure_or_data\":\"structure_and_data\",\"latex_structure_caption\":\"Cấu trúc của bảng @TABLE@\",\"latex_structure_continued_caption\":\"Cấu trúc của bảng @TABLE@ (còn nữa)\",\"latex_structure_label\":\"tab:@TABLE@-structure\",\"latex_relation\":\"something\",\"latex_comments\":\"something\",\"latex_mime\":\"something\",\"latex_columns\":\"something\",\"latex_data_caption\":\"Nội dung của bảng @TABLE@\",\"latex_data_continued_caption\":\"Nội dung của bảng @TABLE@ (còn nữa)\",\"latex_data_label\":\"tab:@TABLE@-data\",\"latex_null\":\"\\\\textit{NULL}\",\"mediawiki_structure_or_data\":\"structure_and_data\",\"mediawiki_caption\":\"something\",\"mediawiki_headers\":\"something\",\"htmlword_structure_or_data\":\"structure_and_data\",\"htmlword_null\":\"NULL\",\"ods_null\":\"NULL\",\"ods_structure_or_data\":\"data\",\"odt_structure_or_data\":\"structure_and_data\",\"odt_relation\":\"something\",\"odt_comments\":\"something\",\"odt_mime\":\"something\",\"odt_columns\":\"something\",\"odt_null\":\"NULL\",\"pdf_report_title\":\"\",\"pdf_structure_or_data\":\"structure_and_data\",\"phparray_structure_or_data\":\"data\",\"sql_include_comments\":\"something\",\"sql_header_comment\":\"\",\"sql_use_transaction\":\"something\",\"sql_compatibility\":\"NONE\",\"sql_structure_or_data\":\"structure_and_data\",\"sql_create_table\":\"something\",\"sql_auto_increment\":\"something\",\"sql_create_view\":\"something\",\"sql_procedure_function\":\"something\",\"sql_create_trigger\":\"something\",\"sql_backquotes\":\"something\",\"sql_type\":\"INSERT\",\"sql_insert_syntax\":\"both\",\"sql_max_query_size\":\"50000\",\"sql_hex_for_binary\":\"something\",\"sql_utc_time\":\"something\",\"texytext_structure_or_data\":\"structure_and_data\",\"texytext_null\":\"NULL\",\"xml_structure_or_data\":\"data\",\"xml_export_events\":\"something\",\"xml_export_functions\":\"something\",\"xml_export_procedures\":\"something\",\"xml_export_tables\":\"something\",\"xml_export_triggers\":\"something\",\"xml_export_views\":\"something\",\"xml_export_contents\":\"something\",\"yaml_structure_or_data\":\"data\",\"\":null,\"lock_tables\":null,\"as_separate_files\":null,\"csv_removeCRLF\":null,\"csv_columns\":null,\"excel_removeCRLF\":null,\"json_pretty_print\":null,\"htmlword_columns\":null,\"ods_columns\":null,\"sql_dates\":null,\"sql_relation\":null,\"sql_mime\":null,\"sql_disable_fk\":null,\"sql_views_as_tables\":null,\"sql_metadata\":null,\"sql_create_database\":null,\"sql_drop_table\":null,\"sql_if_not_exists\":null,\"sql_simple_view_export\":null,\"sql_view_current_user\":null,\"sql_or_replace_view\":null,\"sql_truncate\":null,\"sql_delayed\":null,\"sql_ignore\":null,\"texytext_columns\":null}');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__favorite`
--

CREATE TABLE `pma__favorite` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Favorite tables';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__history`
--

CREATE TABLE `pma__history` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp(),
  `sqlquery` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='SQL history for phpMyAdmin';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__navigationhiding`
--

CREATE TABLE `pma__navigationhiding` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `item_type` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Hidden items of navigation tree';

--
-- Đang đổ dữ liệu cho bảng `pma__navigationhiding`
--

INSERT INTO `pma__navigationhiding` (`username`, `item_name`, `item_type`, `db_name`, `table_name`) VALUES
('root', 'user', 'table', 'test', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__pdf_pages`
--

CREATE TABLE `pma__pdf_pages` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `page_nr` int(10) UNSIGNED NOT NULL,
  `page_descr` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='PDF relation pages for phpMyAdmin';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__recent`
--

CREATE TABLE `pma__recent` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `tables` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Recently accessed tables';

--
-- Đang đổ dữ liệu cho bảng `pma__recent`
--

INSERT INTO `pma__recent` (`username`, `tables`) VALUES
('root', '[{\"db\":\"db_qlbx\",\"table\":\"vengaygui\"},{\"db\":\"db_qlbx\",\"table\":\"nhansu\"},{\"db\":\"db_qlbx\",\"table\":\"vengay\"},{\"db\":\"db_qlbx\",\"table\":\"chodexe\"},{\"db\":\"db_qlbx\",\"table\":\"vethang\"},{\"db\":\"db_qlbx\",\"table\":\"vethanggui\"},{\"db\":\"db_qlbx\",\"table\":\"suco\"},{\"db\":\"db_qlbx\",\"table\":\"dangkyvethang\"},{\"db\":\"db_qlbx\",\"table\":\"khachhang\"},{\"db\":\"db_qlbx\",\"table\":\"xemaygui\"}]');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__relation`
--

CREATE TABLE `pma__relation` (
  `master_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `master_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_db` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_table` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `foreign_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Relation table';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__savedsearches`
--

CREATE TABLE `pma__savedsearches` (
  `id` int(5) UNSIGNED NOT NULL,
  `username` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `search_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Saved searches';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__table_coords`
--

CREATE TABLE `pma__table_coords` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pdf_page_number` int(11) NOT NULL DEFAULT 0,
  `x` float UNSIGNED NOT NULL DEFAULT 0,
  `y` float UNSIGNED NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table coordinates for phpMyAdmin PDF output';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__table_info`
--

CREATE TABLE `pma__table_info` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT '',
  `display_field` varchar(64) COLLATE utf8_bin NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Table information for phpMyAdmin';

--
-- Đang đổ dữ liệu cho bảng `pma__table_info`
--

INSERT INTO `pma__table_info` (`db_name`, `table_name`, `display_field`) VALUES
('db_qlbx', 'dangkyvethang', 'SoDienThoai'),
('db_qlbx', 'vengaygui', 'IDChoDe'),
('db_qlbx', 'vethanggui', 'IDChoDe');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__table_uiprefs`
--

CREATE TABLE `pma__table_uiprefs` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `prefs` text COLLATE utf8_bin NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Tables'' UI preferences';

--
-- Đang đổ dữ liệu cho bảng `pma__table_uiprefs`
--

INSERT INTO `pma__table_uiprefs` (`username`, `db_name`, `table_name`, `prefs`, `last_update`) VALUES
('root', 'db_qlbx', 'vengay', '{\"sorted_col\":\"`vengay`.`GiaVeNgay` ASC\"}', '2022-11-09 02:44:52');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__tracking`
--

CREATE TABLE `pma__tracking` (
  `db_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `table_name` varchar(64) COLLATE utf8_bin NOT NULL,
  `version` int(10) UNSIGNED NOT NULL,
  `date_created` datetime NOT NULL,
  `date_updated` datetime NOT NULL,
  `schema_snapshot` text COLLATE utf8_bin NOT NULL,
  `schema_sql` text COLLATE utf8_bin DEFAULT NULL,
  `data_sql` longtext COLLATE utf8_bin DEFAULT NULL,
  `tracking` set('UPDATE','REPLACE','INSERT','DELETE','TRUNCATE','CREATE DATABASE','ALTER DATABASE','DROP DATABASE','CREATE TABLE','ALTER TABLE','RENAME TABLE','DROP TABLE','CREATE INDEX','DROP INDEX','CREATE VIEW','ALTER VIEW','DROP VIEW') COLLATE utf8_bin DEFAULT NULL,
  `tracking_active` int(1) UNSIGNED NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Database changes tracking for phpMyAdmin';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__userconfig`
--

CREATE TABLE `pma__userconfig` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `timevalue` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `config_data` text COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User preferences storage for phpMyAdmin';

--
-- Đang đổ dữ liệu cho bảng `pma__userconfig`
--

INSERT INTO `pma__userconfig` (`username`, `timevalue`, `config_data`) VALUES
('root', '2022-11-23 03:38:29', '{\"Console\\/Mode\":\"collapse\",\"lang\":\"vi\",\"DefaultConnectionCollation\":\"utf8_vietnamese_ci\"}');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__usergroups`
--

CREATE TABLE `pma__usergroups` (
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL,
  `tab` varchar(64) COLLATE utf8_bin NOT NULL,
  `allowed` enum('Y','N') COLLATE utf8_bin NOT NULL DEFAULT 'N'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='User groups with configured menu items';

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `pma__users`
--

CREATE TABLE `pma__users` (
  `username` varchar(64) COLLATE utf8_bin NOT NULL,
  `usergroup` varchar(64) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Users and their assignments to user groups';

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `pma__central_columns`
--
ALTER TABLE `pma__central_columns`
  ADD PRIMARY KEY (`db_name`,`col_name`);

--
-- Chỉ mục cho bảng `pma__column_info`
--
ALTER TABLE `pma__column_info`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `db_name` (`db_name`,`table_name`,`column_name`);

--
-- Chỉ mục cho bảng `pma__designer_settings`
--
ALTER TABLE `pma__designer_settings`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_user_type_template` (`username`,`export_type`,`template_name`);

--
-- Chỉ mục cho bảng `pma__favorite`
--
ALTER TABLE `pma__favorite`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `pma__history`
--
ALTER TABLE `pma__history`
  ADD PRIMARY KEY (`id`),
  ADD KEY `username` (`username`,`db`,`table`,`timevalue`);

--
-- Chỉ mục cho bảng `pma__navigationhiding`
--
ALTER TABLE `pma__navigationhiding`
  ADD PRIMARY KEY (`username`,`item_name`,`item_type`,`db_name`,`table_name`);

--
-- Chỉ mục cho bảng `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  ADD PRIMARY KEY (`page_nr`),
  ADD KEY `db_name` (`db_name`);

--
-- Chỉ mục cho bảng `pma__recent`
--
ALTER TABLE `pma__recent`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `pma__relation`
--
ALTER TABLE `pma__relation`
  ADD PRIMARY KEY (`master_db`,`master_table`,`master_field`),
  ADD KEY `foreign_field` (`foreign_db`,`foreign_table`);

--
-- Chỉ mục cho bảng `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `u_savedsearches_username_dbname` (`username`,`db_name`,`search_name`);

--
-- Chỉ mục cho bảng `pma__table_coords`
--
ALTER TABLE `pma__table_coords`
  ADD PRIMARY KEY (`db_name`,`table_name`,`pdf_page_number`);

--
-- Chỉ mục cho bảng `pma__table_info`
--
ALTER TABLE `pma__table_info`
  ADD PRIMARY KEY (`db_name`,`table_name`);

--
-- Chỉ mục cho bảng `pma__table_uiprefs`
--
ALTER TABLE `pma__table_uiprefs`
  ADD PRIMARY KEY (`username`,`db_name`,`table_name`);

--
-- Chỉ mục cho bảng `pma__tracking`
--
ALTER TABLE `pma__tracking`
  ADD PRIMARY KEY (`db_name`,`table_name`,`version`);

--
-- Chỉ mục cho bảng `pma__userconfig`
--
ALTER TABLE `pma__userconfig`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `pma__usergroups`
--
ALTER TABLE `pma__usergroups`
  ADD PRIMARY KEY (`usergroup`,`tab`,`allowed`);

--
-- Chỉ mục cho bảng `pma__users`
--
ALTER TABLE `pma__users`
  ADD PRIMARY KEY (`username`,`usergroup`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `pma__bookmark`
--
ALTER TABLE `pma__bookmark`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `pma__column_info`
--
ALTER TABLE `pma__column_info`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `pma__export_templates`
--
ALTER TABLE `pma__export_templates`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `pma__history`
--
ALTER TABLE `pma__history`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `pma__pdf_pages`
--
ALTER TABLE `pma__pdf_pages`
  MODIFY `page_nr` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `pma__savedsearches`
--
ALTER TABLE `pma__savedsearches`
  MODIFY `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Cơ sở dữ liệu: `test`
--
CREATE DATABASE IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `test`;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `areaparking`
--

CREATE TABLE `areaparking` (
  `id` varchar(255) NOT NULL,
  `slot` int(11) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `areaparking`
--

INSERT INTO `areaparking` (`id`, `slot`, `status`) VALUES
('A1', 1, b'1'),
('A10', 0, b'0'),
('A2', 1, b'1'),
('A3', 1, b'1'),
('A4', 1, b'1'),
('A5', 1, b'1'),
('A6', 1, b'1'),
('A7', 1, b'1'),
('A8', 1, b'1'),
('A9', 1, b'1'),
('B1', 9, b'1'),
('B10', 9, b'1'),
('B11', 9, b'1'),
('B2', 9, b'1'),
('B3', 9, b'1'),
('B4', 9, b'1'),
('B5', 9, b'1'),
('B6', 9, b'1'),
('B7', 9, b'1'),
('B8', 9, b'1'),
('B9', 9, b'1');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `financial_report`
--

CREATE TABLE `financial_report` (
  `id` int(11) NOT NULL,
  `timeend` datetime DEFAULT NULL,
  `timestart` datetime DEFAULT NULL,
  `ticket_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `financial_report`
--

INSERT INTO `financial_report` (`id`, `timeend`, `timestart`, `ticket_id`) VALUES
(1, NULL, '2022-10-07 16:27:33', 2006);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(7);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ticket`
--

CREATE TABLE `ticket` (
  `id` int(11) NOT NULL,
  `price` int(11) DEFAULT NULL,
  `registrationtime` datetime DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `ticket`
--

INSERT INTO `ticket` (`id`, `price`, `registrationtime`, `type`) VALUES
(1000, 3000, NULL, 'daily'),
(1001, 3000, NULL, 'daily'),
(1002, 3000, NULL, 'daily'),
(1003, 3000, NULL, 'daily'),
(1004, 3000, NULL, 'daily'),
(1005, 3000, NULL, 'daily'),
(1100, 60000, NULL, 'monthly'),
(1101, 60000, NULL, 'monthly'),
(1102, 60000, NULL, 'monthly'),
(1103, 60000, NULL, 'monthly'),
(1104, 60000, NULL, 'monthly'),
(1105, 60000, NULL, 'monthly'),
(2000, 20000, NULL, 'daily'),
(2001, 20000, NULL, 'daily'),
(2005, 20000, NULL, 'daily'),
(2006, 20000, '2022-10-07 16:27:33', 'daily'),
(2100, 500000, NULL, 'monthly'),
(2101, 500000, NULL, 'monthly'),
(2102, 500000, NULL, 'monthly'),
(2103, 500000, NULL, 'monthly'),
(2104, 500000, NULL, 'monthly'),
(2105, 500000, NULL, 'monthly'),
(2106, 500000, NULL, 'monthly');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `role` varchar(255) NOT NULL DEFAULT 'USER'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`id`, `avatar`, `birthday`, `email`, `fullname`, `password`, `phone`, `role`) VALUES
(1, NULL, '2022-09-10 00:00:00', 'ngphuongnam10@gmail.com', 'Le Anh Tuan', 'leanhtuan', '0977772324', 'ADMIN'),
(2, 'boy.img', '2022-09-10 00:00:00', 'ngphuongnam111@gmail.com', 'Nguyen Duc Minh', '987654321', '123456789', 'ADMIN'),
(123, 'son.img', '2022-10-26 09:03:10', 'son172965@nuce.edu.vn', 'Le Hong Son', '26102002', '261002', 'USER'),
(2709, 'son.img', '2022-09-27 09:03:10', 'adagaki279@gmail.com', 'Le Anh Tuan', '270902', '27092002', 'USER'),
(5665, 'doremon.img', '2022-09-01 17:19:42', 'minhle@gmail.com', 'Le Cong Minh', '123456789', '010502', 'USER');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `vehicle`
--

CREATE TABLE `vehicle` (
  `id` varchar(255) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `area_parking` varchar(255) DEFAULT NULL,
  `ticket_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Đang đổ dữ liệu cho bảng `vehicle`
--

INSERT INTO `vehicle` (`id`, `type`, `area_parking`, `ticket_id`) VALUES
('29-H11234', 'car', 'A10', 2006);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `areaparking`
--
ALTER TABLE `areaparking`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `financial_report`
--
ALTER TABLE `financial_report`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKfxorewxvhxj79aa2ih2b1uet4` (`ticket_id`);

--
-- Chỉ mục cho bảng `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`);

--
-- Chỉ mục cho bảng `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6c4t4htc6sfrvdv54d4sd5ekm` (`area_parking`),
  ADD KEY `FKls958dg6i5g039hnmn0gorngn` (`ticket_id`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `financial_report`
--
ALTER TABLE `financial_report`
  ADD CONSTRAINT `FKfxorewxvhxj79aa2ih2b1uet4` FOREIGN KEY (`ticket_id`) REFERENCES `ticket` (`id`);

--
-- Các ràng buộc cho bảng `vehicle`
--
ALTER TABLE `vehicle`
  ADD CONSTRAINT `FK6c4t4htc6sfrvdv54d4sd5ekm` FOREIGN KEY (`area_parking`) REFERENCES `areaparking` (`id`),
  ADD CONSTRAINT `FKls958dg6i5g039hnmn0gorngn` FOREIGN KEY (`ticket_id`) REFERENCES `ticket` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
