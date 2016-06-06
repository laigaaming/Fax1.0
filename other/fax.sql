/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.5.43 : Database - fax
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`fax` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `fax`;

/*Table structure for table `fx` */

DROP TABLE IF EXISTS `fx`;

CREATE TABLE `fx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `scur` varchar(50) NOT NULL,
  `tcur` varchar(50) NOT NULL,
  `rate` double NOT NULL,
  `date` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=282 DEFAULT CHARSET=utf8;

/*Data for the table `fx` */

insert  into `fx`(`id`,`scur`,`tcur`,`rate`,`date`) values (2,'USD','CNY',6.4737,'20160501'),(3,'USD','AUD',1.3146,'20160501'),(4,'USD','CAD',1.2552,'20160501'),(5,'USD','EUR',0.8736,'20160501'),(6,'CNY','USD',0.154471,'20160501'),(7,'CNY','AUD',0.203068,'20160501'),(8,'CNY','CAD',0.193892,'20160501'),(9,'CNY','EUR',0.134946,'20160501'),(10,'AUD','USD',0.760688,'20160501'),(11,'AUD','CNY',4.924464,'20160501'),(12,'AUD','CAD',0.954815,'20160501'),(13,'AUD','EUR',0.664537,'20160501'),(14,'CAD','USD',0.796686,'20160501'),(15,'CAD','CNY',5.157505,'20160501'),(16,'CAD','AUD',1.047323,'20160501'),(17,'CAD','EUR',0.695985,'20160501'),(18,'EUR','USD',1.144689,'20160501'),(19,'EUR','CNY',7.410371,'20160501'),(20,'EUR','AUD',1.504808,'20160501'),(21,'EUR','CAD',1.436813,'20160501'),(22,'USD','CNY',6.4179,'20160502'),(23,'USD','AUD',1.3121,'20160502'),(24,'USD','CAD',1.2535,'20160502'),(25,'USD','EUR',0.8715,'20160502'),(26,'CNY','USD',0.155814,'20160502'),(27,'CNY','AUD',0.204444,'20160502'),(28,'CNY','CAD',0.195313,'20160502'),(29,'CNY','EUR',0.135792,'20160502'),(30,'AUD','USD',0.762137,'20160502'),(31,'AUD','CNY',4.891319,'20160502'),(32,'AUD','CAD',0.955339,'20160502'),(33,'AUD','EUR',0.664202,'20160502'),(34,'CAD','USD',0.797766,'20160502'),(35,'CAD','CNY',5.119984,'20160502'),(36,'CAD','AUD',1.046749,'20160502'),(37,'CAD','EUR',0.695253,'20160502'),(38,'EUR','USD',1.147447,'20160502'),(39,'EUR','CNY',7.3642,'20160502'),(40,'EUR','AUD',1.505565,'20160502'),(41,'EUR','CAD',1.438325,'20160502'),(42,'USD','CNY',6.4739,'20160503'),(43,'USD','AUD',1.3023,'20160503'),(44,'USD','CAD',1.2518,'20160503'),(45,'USD','EUR',0.8669,'20160503'),(46,'CNY','USD',0.154466,'20160503'),(47,'CNY','AUD',0.201162,'20160503'),(48,'CNY','CAD',0.193361,'20160503'),(49,'CNY','EUR',0.133907,'20160503'),(50,'AUD','USD',0.767872,'20160503'),(51,'AUD','CNY',4.971128,'20160503'),(52,'AUD','CAD',0.961222,'20160503'),(53,'AUD','EUR',0.665668,'20160503'),(54,'CAD','USD',0.79885,'20160503'),(55,'CAD','CNY',5.171673,'20160503'),(56,'CAD','AUD',1.040342,'20160503'),(57,'CAD','EUR',0.692523,'20160503'),(58,'EUR','USD',1.153536,'20160503'),(59,'EUR','CNY',7.467874,'20160503'),(60,'EUR','AUD',1.502249,'20160503'),(61,'EUR','CAD',1.443996,'20160503'),(62,'USD','CNY',6.4915,'20160504'),(63,'USD','AUD',1.3331,'20160504'),(64,'USD','CAD',1.2705,'20160504'),(65,'USD','EUR',0.8692,'20160504'),(66,'CNY','USD',0.154048,'20160504'),(67,'CNY','AUD',0.205361,'20160504'),(68,'CNY','CAD',0.195717,'20160504'),(69,'CNY','EUR',0.133898,'20160504'),(70,'AUD','USD',0.750131,'20160504'),(71,'AUD','CNY',4.869477,'20160504'),(72,'AUD','CAD',0.953042,'20160504'),(73,'AUD','EUR',0.652014,'20160504'),(74,'CAD','USD',0.787092,'20160504'),(75,'CAD','CNY',5.109406,'20160504'),(76,'CAD','AUD',1.049272,'20160504'),(77,'CAD','EUR',0.68414,'20160504'),(78,'EUR','USD',1.150483,'20160504'),(79,'EUR','CNY',7.468362,'20160504'),(80,'EUR','AUD',1.533709,'20160504'),(81,'EUR','CAD',1.461689,'20160504'),(82,'USD','CNY',6.4961,'20160505'),(83,'USD','AUD',1.3403,'20160505'),(84,'USD','CAD',1.2866,'20160505'),(85,'USD','EUR',0.8706,'20160505'),(86,'CNY','USD',0.153939,'20160505'),(87,'CNY','AUD',0.206324,'20160505'),(88,'CNY','CAD',0.198057,'20160505'),(89,'CNY','EUR',0.134019,'20160505'),(90,'AUD','USD',0.746102,'20160505'),(91,'AUD','CNY',4.846751,'20160505'),(92,'AUD','CAD',0.959934,'20160505'),(93,'AUD','EUR',0.649556,'20160505'),(94,'CAD','USD',0.777242,'20160505'),(95,'CAD','CNY',5.049044,'20160505'),(96,'CAD','AUD',1.041738,'20160505'),(97,'CAD','EUR',0.676667,'20160505'),(98,'EUR','USD',1.148633,'20160505'),(99,'EUR','CNY',7.461636,'20160505'),(100,'EUR','AUD',1.539513,'20160505'),(101,'EUR','CAD',1.477831,'20160505'),(102,'USD','CNY',6.5044,'20160506'),(103,'USD','AUD',1.3381,'20160506'),(104,'USD','CAD',1.2866,'20160506'),(105,'USD','EUR',0.8772,'20160506'),(106,'CNY','USD',0.153742,'20160506'),(107,'CNY','AUD',0.205722,'20160506'),(108,'CNY','CAD',0.197805,'20160506'),(109,'CNY','EUR',0.134863,'20160506'),(110,'AUD','USD',0.747328,'20160506'),(111,'AUD','CNY',4.860922,'20160506'),(112,'AUD','CAD',0.961513,'20160506'),(113,'AUD','EUR',0.655556,'20160506'),(114,'CAD','USD',0.777242,'20160506'),(115,'CAD','CNY',5.055495,'20160506'),(116,'CAD','AUD',1.040028,'20160506'),(117,'CAD','EUR',0.681797,'20160506'),(118,'EUR','USD',1.139991,'20160506'),(119,'EUR','CNY',7.414957,'20160506'),(120,'EUR','AUD',1.525422,'20160506'),(121,'EUR','CAD',1.466712,'20160506'),(122,'USD','CNY',6.4983,'20160507'),(123,'USD','AUD',1.3575,'20160507'),(124,'USD','CAD',1.2909,'20160507'),(125,'USD','EUR',0.8768,'20160507'),(126,'CNY','USD',0.153886,'20160507'),(127,'CNY','AUD',0.208901,'20160507'),(128,'CNY','CAD',0.198652,'20160507'),(129,'CNY','EUR',0.134928,'20160507'),(130,'AUD','USD',0.736648,'20160507'),(131,'AUD','CNY',4.786961,'20160507'),(132,'AUD','CAD',0.950939,'20160507'),(133,'AUD','EUR',0.645893,'20160507'),(134,'CAD','USD',0.774653,'20160507'),(135,'CAD','CNY',5.03393,'20160507'),(136,'CAD','AUD',1.051592,'20160507'),(137,'CAD','EUR',0.679216,'20160507'),(138,'EUR','USD',1.140511,'20160507'),(139,'EUR','CNY',7.411382,'20160507'),(140,'EUR','AUD',1.548244,'20160507'),(141,'EUR','CAD',1.472286,'20160507'),(142,'USD','CNY',6.4983,'20160508'),(143,'USD','AUD',1.3575,'20160508'),(144,'USD','CAD',1.2909,'20160508'),(145,'USD','EUR',0.8768,'20160508'),(146,'CNY','USD',0.153886,'20160508'),(147,'CNY','AUD',0.208901,'20160508'),(148,'CNY','CAD',0.198652,'20160508'),(149,'CNY','EUR',0.134928,'20160508'),(150,'AUD','USD',0.736648,'20160508'),(151,'AUD','CNY',4.786961,'20160508'),(152,'AUD','CAD',0.950939,'20160508'),(153,'AUD','EUR',0.645893,'20160508'),(154,'CAD','USD',0.774653,'20160508'),(155,'CAD','CNY',5.03393,'20160508'),(156,'CAD','AUD',1.051592,'20160508'),(157,'CAD','EUR',0.679216,'20160508'),(158,'EUR','USD',1.140511,'20160508'),(159,'EUR','CNY',7.411382,'20160508'),(160,'EUR','AUD',1.548244,'20160508'),(161,'EUR','CAD',1.472286,'20160508'),(162,'USD','CNY',6.5097,'20160509'),(163,'USD','AUD',1.3582,'20160509'),(164,'USD','CAD',1.2941,'20160509'),(165,'USD','EUR',0.8787,'20160509'),(166,'CNY','USD',0.153617,'20160509'),(167,'CNY','AUD',0.208642,'20160509'),(168,'CNY','CAD',0.198796,'20160509'),(169,'CNY','EUR',0.134983,'20160509'),(170,'AUD','USD',0.736269,'20160509'),(171,'AUD','CNY',4.792888,'20160509'),(172,'AUD','CAD',0.952805,'20160509'),(173,'AUD','EUR',0.646959,'20160509'),(174,'CAD','USD',0.772738,'20160509'),(175,'CAD','CNY',5.030291,'20160509'),(176,'CAD','AUD',1.049532,'20160509'),(177,'CAD','EUR',0.679005,'20160509'),(178,'EUR','USD',1.138045,'20160509'),(179,'EUR','CNY',7.40833,'20160509'),(180,'EUR','AUD',1.545693,'20160509'),(181,'EUR','CAD',1.472744,'20160509'),(182,'USD','CNY',6.5187,'20160511'),(183,'USD','AUD',1.3538,'20160511'),(184,'USD','CAD',1.2903,'20160511'),(185,'USD','EUR',0.8787,'20160511'),(186,'CNY','USD',0.153405,'20160511'),(187,'CNY','AUD',0.207679,'20160511'),(188,'CNY','CAD',0.197938,'20160511'),(189,'CNY','EUR',0.134797,'20160511'),(190,'AUD','USD',0.738662,'20160511'),(191,'AUD','CNY',4.815113,'20160511'),(192,'AUD','CAD',0.953095,'20160511'),(193,'AUD','EUR',0.649062,'20160511'),(194,'CAD','USD',0.775014,'20160511'),(195,'CAD','CNY',5.052081,'20160511'),(196,'CAD','AUD',1.049213,'20160511'),(197,'CAD','EUR',0.681004,'20160511'),(198,'EUR','USD',1.138045,'20160511'),(199,'EUR','CNY',7.418573,'20160511'),(200,'EUR','AUD',1.540685,'20160511'),(201,'EUR','CAD',1.468419,'20160511'),(202,'USD','CNY',6.4919,'20160512'),(203,'USD','AUD',1.3576,'20160512'),(204,'USD','CAD',1.2857,'20160512'),(205,'USD','EUR',0.875,'20160512'),(206,'CNY','USD',0.154038,'20160512'),(207,'CNY','AUD',0.209122,'20160512'),(208,'CNY','CAD',0.198047,'20160512'),(209,'CNY','EUR',0.134783,'20160512'),(210,'AUD','USD',0.736594,'20160512'),(211,'AUD','CNY',4.781895,'20160512'),(212,'AUD','CAD',0.947039,'20160512'),(213,'AUD','EUR',0.64452,'20160512'),(214,'CAD','USD',0.777786,'20160512'),(215,'CAD','CNY',5.049312,'20160512'),(216,'CAD','AUD',1.055923,'20160512'),(217,'CAD','EUR',0.680563,'20160512'),(218,'EUR','USD',1.142857,'20160512'),(219,'EUR','CNY',7.419314,'20160512'),(220,'EUR','AUD',1.551543,'20160512'),(221,'EUR','CAD',1.469371,'20160512'),(222,'USD','CNY',6.5195,'20160513'),(223,'USD','AUD',1.3676,'20160513'),(224,'USD','CAD',1.2847,'20160513'),(225,'USD','EUR',0.8792,'20160513'),(226,'CNY','USD',0.153386,'20160513'),(227,'CNY','AUD',0.209771,'20160513'),(228,'CNY','CAD',0.197055,'20160513'),(229,'CNY','EUR',0.134857,'20160513'),(230,'AUD','USD',0.731208,'20160513'),(231,'AUD','CNY',4.76711,'20160513'),(232,'AUD','CAD',0.939383,'20160513'),(233,'AUD','EUR',0.642878,'20160513'),(234,'CAD','USD',0.778392,'20160513'),(235,'CAD','CNY',5.074726,'20160513'),(236,'CAD','AUD',1.064529,'20160513'),(237,'CAD','EUR',0.684362,'20160513'),(238,'EUR','USD',1.137398,'20160513'),(239,'EUR','CNY',7.415264,'20160513'),(240,'EUR','AUD',1.555505,'20160513'),(241,'EUR','CAD',1.461215,'20160513'),(242,'USD','CNY',6.5326,'20160514'),(243,'USD','AUD',1.3759,'20160514'),(244,'USD','CAD',1.2938,'20160514'),(245,'USD','EUR',0.8843,'20160514'),(246,'CNY','USD',0.153078,'20160514'),(247,'CNY','AUD',0.210621,'20160514'),(248,'CNY','CAD',0.198053,'20160514'),(249,'CNY','EUR',0.135367,'20160514'),(250,'AUD','USD',0.726797,'20160514'),(251,'AUD','CNY',4.747874,'20160514'),(252,'AUD','CAD',0.94033,'20160514'),(253,'AUD','EUR',0.642707,'20160514'),(254,'CAD','USD',0.772917,'20160514'),(255,'CAD','CNY',5.049158,'20160514'),(256,'CAD','AUD',1.063456,'20160514'),(257,'CAD','EUR',0.68349,'20160514'),(258,'EUR','USD',1.130838,'20160514'),(259,'EUR','CNY',7.387312,'20160514'),(260,'EUR','AUD',1.55592,'20160514'),(261,'EUR','CAD',1.463078,'20160514'),(262,'USD','CNY',6.5326,'20160515'),(263,'USD','AUD',1.3759,'20160515'),(264,'USD','CAD',1.2938,'20160515'),(265,'USD','EUR',0.8843,'20160515'),(266,'CNY','USD',0.153078,'20160515'),(267,'CNY','AUD',0.210621,'20160515'),(268,'CNY','CAD',0.198053,'20160515'),(269,'CNY','EUR',0.135367,'20160515'),(270,'AUD','USD',0.726797,'20160515'),(271,'AUD','CNY',4.747874,'20160515'),(272,'AUD','CAD',0.94033,'20160515'),(273,'AUD','EUR',0.642707,'20160515'),(274,'CAD','USD',0.772917,'20160515'),(275,'CAD','CNY',5.049158,'20160515'),(276,'CAD','AUD',1.063456,'20160515'),(277,'CAD','EUR',0.68349,'20160515'),(278,'EUR','USD',1.130838,'20160515'),(279,'EUR','CNY',7.387312,'20160515'),(280,'EUR','AUD',1.55592,'20160515'),(281,'EUR','CAD',1.463078,'20160515');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;