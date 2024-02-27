CREATE DATABASE  IF NOT EXISTS `antoanbaomat_nhom6`;
USE `antoanbaomat_nhom6`;

--
-- Table structure for table `chusohuu`
--

DROP TABLE IF EXISTS `chusohuu`;
CREATE TABLE `chusohuu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name`varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `sdt` varchar(20) default NULL,
  `publickey` varchar(500) unique,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;




