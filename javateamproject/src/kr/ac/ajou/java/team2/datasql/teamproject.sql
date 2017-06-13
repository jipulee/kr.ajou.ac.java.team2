/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.18 : Database - javatest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`javatest` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `javatest`;

/*Table structure for table `choicequestion` */

DROP TABLE IF EXISTS `choicequestion`;

CREATE TABLE `choicequestion` (
  `questionNum` int(32) unsigned NOT NULL,
  `correctAnswer` varchar(126) DEFAULT NULL,
  `answerA` varchar(126) DEFAULT NULL,
  `answerB` varchar(126) DEFAULT NULL,
  `answerC` varchar(126) DEFAULT NULL,
  `answerD` varchar(126) DEFAULT NULL,
  `question` varchar(126) NOT NULL,
  PRIMARY KEY (`questionNum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `choicequestion` */

insert  into `choicequestion`(`questionNum`,`correctAnswer`,`answerA`,`answerB`,`answerC`,`answerD`,`question`) values (1,'dddd','aaaa','bbbb','cccc','dddd','quesques?????'),(2,'dddd','aaa','bbbb','cccc','dddd','qqqqqqwwww?????'),(3,'eqeqe','dfdf','dfdf','dfdfd','eqeqe','cccc'),(4,'sd','sdfsf','sdfsf','sdfsdf','sfsdf','asdad???'),(5,'asdasds','s','sdf','sf','sdfs','asdadada?????'),(6,'asdasda',NULL,NULL,NULL,NULL,'adasdasd'),(7,'asdas','asd','ada',NULL,NULL,'asda'),(8,'sdadad','adad','ada','ada','dada','ddad'),(9,'SDASDASD','asda','asdas','asdasda','dadas','ada'),(10,'asadasda','asdad','dasda','dasd','asdas','asdada'),(11,'keyword',NULL,NULL,NULL,NULL,'sadasdqw'),(12,'Integer or Boolean',NULL,NULL,NULL,NULL,'asdasda'),(13,'All statements are correct.\r\n',NULL,NULL,NULL,NULL,'sasdasd'),(14,'double\r\n',NULL,NULL,NULL,NULL,'asdasd'),(15,'-32768 to 32767',NULL,NULL,NULL,NULL,'asdasd'),(16,'Compilation error\r\n','asdasd',NULL,NULL,NULL,'asdasd'),(17,'0 2 4 6 8','asdas',NULL,NULL,NULL,'asdasd'),(18,'301.5656\r\n','asdas',NULL,NULL,NULL,'asdas'),(19,'0 to 65535\r\n',NULL,NULL,NULL,NULL,'asdas'),(20,'static method',NULL,NULL,NULL,NULL,'asdasdasdasd?'),(21,'',NULL,NULL,NULL,NULL,'adasdadadadad'),(22,'adsad',NULL,NULL,NULL,NULL,'adsdsadas???'),(23,'zczxc',NULL,NULL,NULL,NULL,'adsadadasd???'),(24,'asd',NULL,NULL,NULL,NULL,'sfsdfsdfsD?'),(25,NULL,NULL,NULL,NULL,NULL,'sdfdsfdsfdsf'),(26,NULL,NULL,NULL,NULL,NULL,'asdsadada'),(27,NULL,NULL,NULL,NULL,NULL,'asdasdas???'),(28,NULL,NULL,NULL,NULL,NULL,'asdadsadsa???'),(29,NULL,NULL,NULL,NULL,NULL,'asdasdasd???'),(30,NULL,NULL,NULL,NULL,NULL,'asdadxczxcz??'),(31,NULL,NULL,NULL,NULL,NULL,'asdasdada???'),(32,NULL,NULL,NULL,NULL,NULL,'adadsdadasdas'),(33,NULL,NULL,NULL,NULL,NULL,'adadadads???'),(34,NULL,NULL,NULL,NULL,NULL,'sxczxczsD??'),(35,NULL,NULL,NULL,NULL,NULL,'asdaxcxzcad??'),(36,NULL,NULL,NULL,NULL,NULL,'adadadaxas??');

/*Table structure for table `partbquestion` */

DROP TABLE IF EXISTS `partbquestion`;

CREATE TABLE `partbquestion` (
  `questionNum` int(16) NOT NULL,
  `question` varchar(126) NOT NULL,
  `correctAnswer` varchar(126) NOT NULL,
  PRIMARY KEY (`questionNum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `partbquestion` */

insert  into `partbquestion`(`questionNum`,`question`,`correctAnswer`) values (1,'asdas','asda'),(2,'asdas','asd'),(3,'asdas','asdasd'),(4,'asdasd','asdasqqqw'),(5,'sdfdfsdfsdfd','xfdfsdfsd'),(6,'fdsfsffsdfsdf','sdsfsdfs'),(7,'xcvxcvcvsdsd','sdfsfsfs'),(8,'sfsdfdsfs','xcvxcvcxv'),(9,'xcxcvx','sdfswe'),(10,'asdasda','asdad');

/*Table structure for table `partcquestion` */

DROP TABLE IF EXISTS `partcquestion`;

CREATE TABLE `partcquestion` (
  `questionNum` int(12) NOT NULL,
  `question` varchar(126) NOT NULL,
  PRIMARY KEY (`questionNum`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `partcquestion` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(64) NOT NULL,
  `password` varchar(64) NOT NULL,
  `answer` varchar(264) DEFAULT NULL,
  `realname` varchar(64) NOT NULL,
  `scoreA` int(32) DEFAULT NULL,
  `answer1` varchar(264) DEFAULT NULL,
  `answer2` varchar(264) DEFAULT NULL,
  `answer3` varchar(264) DEFAULT NULL,
  `answer4` varchar(264) DEFAULT NULL,
  `answer5` varchar(264) DEFAULT NULL,
  `scoreB` int(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`,`answer`,`realname`,`scoreA`,`answer1`,`answer2`,`answer3`,`answer4`,`answer5`,`scoreB`) values (1,'lee','1234',NULL,'lijipu',6,NULL,NULL,NULL,NULL,NULL,4),(2,'ming','1234',NULL,'mmm',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'reee','1234',NULL,'repu',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'ddss','1234',NULL,'qqwe',NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'midone','1234',NULL,'aaa',NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
