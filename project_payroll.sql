-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2021 at 04:39 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project_payroll`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `ID` int(10) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Sector` varchar(25) NOT NULL,
  `Salary` varchar(20) NOT NULL,
  `Gender` varchar(8) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `payment` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`ID`, `Name`, `Sector`, `Salary`, `Gender`, `Address`, `Email`, `Phone`, `payment`) VALUES
(2, 'Nurnabi Rahat', 'software developer', '10000', 'Male', 'chilttagong', 'rahat@gmail.com', '018********', ''),
(4, 'Pottoy Das', 'web developer', '15000', 'Male', 'chittagong', 'prottoy@gmil.com', '018********', ''),
(5, 'Abed Hossen Shymon', 'web developer', '15000', 'Male', 'Chittagong', 'abed@gmail.com', '018********', ''),
(6, 'tanvir alam', 'networking', '30000', 'Male', 'chittgong', 'tanvir@gmail.com', '017********', ''),
(13, 'Atef Abrar Bhuiyan', 'Web developer', '23000', 'Male', 'Dhaka', 'atef@gmail.com', '018********', ''),
(7001, 'Safiullah', 'Web developer', '20000', 'Male', 'Kuyaish', 'Safi@gmail.com', '018********', ''),
(5555984, 'Md. Muhtadir Rahman', 'Teaching', '28000', 'Male', 'Khulshi, Chittagong', 'muhtadirrahman@gmail.com', '01811350997', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
