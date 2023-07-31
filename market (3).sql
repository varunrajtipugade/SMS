-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 23, 2020 at 09:27 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `market`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE IF NOT EXISTS `bill` (
`bill_id` int(11) NOT NULL,
  `ammount` float NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `profit` float NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`bill_id`, `ammount`, `date`, `profit`) VALUES
(1, 19.99, '2020-02-21 11:08:16', 5.99),
(2, 29.975, '2020-02-21 11:10:57', 7.975);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE IF NOT EXISTS `employee` (
`emp_id` int(11) NOT NULL,
  `empname` varchar(30) NOT NULL,
  `desig` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `sal` float NOT NULL,
  `mob` decimal(11,0) NOT NULL,
  `dob` date NOT NULL,
  `join_date` date NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `empname`, `desig`, `address`, `sal`, `mob`, `dob`, `join_date`, `username`, `password`) VALUES
(1, 'Varunraj', 'Manager', 'Gargoti', 500000, '7030212587', '2001-03-17', '2020-01-07', 'varunraj07', '0707');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
`pid` int(11) NOT NULL,
  `pname` varchar(30) NOT NULL,
  `catagory` varchar(30) NOT NULL,
  `price` float NOT NULL,
  `prc_price` float NOT NULL,
  `gst` float NOT NULL,
  `discount` float NOT NULL,
  `packdate` date NOT NULL,
  `expiry` date NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`pid`, `pname`, `catagory`, `price`, `prc_price`, `gst`, `discount`, `packdate`, `expiry`, `total`) VALUES
(1, 'maggi', 'Frozen Foods', 10, 7, 1.2, 1.3, '2020-02-01', '2020-08-29', 76),
(2, 'lays', 'Frozen Foods', 5, 4, 0.2, 0.5, '2020-02-01', '2020-02-29', 78);

-- --------------------------------------------------------

--
-- Table structure for table `vendor`
--

CREATE TABLE IF NOT EXISTS `vendor` (
`v_id` int(11) NOT NULL,
  `v_name` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `agency` varchar(30) NOT NULL,
  `mob` decimal(10,0) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendor`
--

INSERT INTO `vendor` (`v_id`, `v_name`, `address`, `agency`, `mob`, `email`) VALUES
(1, 'Salman Khan', 'Mumbai', 'Mumbai', '9865741258', 'fgdf@gmail.com'),
(2, 'win deisel', 'los angeles', 'Fast', '7845123698', 'dom9@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `vendororder`
--

CREATE TABLE IF NOT EXISTS `vendororder` (
`srno` int(11) NOT NULL,
  `pid` int(11) NOT NULL,
  `pname` varchar(30) NOT NULL,
  `qty` float NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendororder`
--

INSERT INTO `vendororder` (`srno`, `pid`, `pname`, `qty`, `date`) VALUES
(1, 1, 'maggi', 10, '2020-01-20 18:30:00'),
(2, 2, 'lays', 20, '2020-02-20 18:30:00'),
(3, 1, 'maggi', 30, '2020-02-21 14:56:15');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
 ADD PRIMARY KEY (`bill_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
 ADD PRIMARY KEY (`emp_id`), ADD UNIQUE KEY `username` (`username`), ADD UNIQUE KEY `username_2` (`username`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
 ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `vendor`
--
ALTER TABLE `vendor`
 ADD PRIMARY KEY (`v_id`);

--
-- Indexes for table `vendororder`
--
ALTER TABLE `vendororder`
 ADD PRIMARY KEY (`srno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill`
--
ALTER TABLE `bill`
MODIFY `bill_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
MODIFY `emp_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `vendor`
--
ALTER TABLE `vendor`
MODIFY `v_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `vendororder`
--
ALTER TABLE `vendororder`
MODIFY `srno` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
