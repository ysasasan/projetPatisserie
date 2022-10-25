-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: db-patisserie
-- ------------------------------------------------------
-- Server version	5.7.12-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `patisserie`
--

LOCK TABLES `patisserie` WRITE;
/*!40000 ALTER TABLE `patisserie` DISABLE KEYS */;
INSERT INTO `patisserie` VALUES (1,'gâteau','Dessert crêmeux avec de la noisette et des amandes','','farine de blé, avec gluten','Paris-Brest',7,1),(2,'tarte','Crème patissaire fraise bio espagne','','farine de blé complet, sans gluten','Tarte aux Fraises',10,1),(3,'tarte','Crème patissaire pomme bio de Garonne','','farine de blé complet, sans gluten','Tarte aux Pommes',11,1),(4,'tarte','Crème criton bio zeste  de citron basilic','','farine de blé complet, avec gluten','Tarte aux Citrons',12,1),(5,'tarte','Crème criton et meringue caramélisé','','farine de blé, sans gluten','Tarte cirton meringué',14,1),(6,'tarte','Crème fouté framboise bio','','farine de blé, avec gluten','Tarte cirton framboise',10,1),(7,'tarte','Crème patissière chocolat au lait recouvert chololat noir','','farine de blé, chocolat arabica','Tarte aux trois chocolat',7,1),(8,'gateau ','Dessert composé d\'un gâteau brioché arrosé de rhum et chantilly ',NULL,'Farine de blé, rhum martinique, avec gluten ','Baba aux Rhum ',10,1),(9,'miniardise','petit miniardise, mou à l\'intérieur et caramélisé à l\'extérieur, entouré de cannelures',NULL,'lait bio sud ouest, farine blé complet ','Cannelé',6,1),(10,'miniardise','Pâte à choux allongée et fourrée de crème au chocolat, avec un glaçage sur le dessus.',NULL,'farine de blé complet, sans gluten','Eclaire aux chocolat ',7,1),(11,'miniardise','Pâte à choux allongée et fourrée de crème pistache, avec un glaçage sur le dessus.',NULL,'farine de blé complet, sans gluten','Eclaire à la pistache',7,1),(12,'gateau','Gateau à base de  poudre d\'amandes et de blancs d\'œufs',NULL,'farine de blé, amande bio, sans gluten','Financier',8,1),(13,'gateau','Mi-cuit chocolat ',NULL,'farine de blé, chocolat arabica, avec  gluten','Coeur Coulant',9,1),(14,'gateau','Fraises, de génoise, de crème mousseline et  d\'une couche de pâte d\'amande ',NULL,'farine blé, oeufs  bio, sans gluten','Fraisier',14,1),(15,'gateau','Pâte feuilletée, de beurre demi-sel et de sucre caramélisé',NULL,'farine blé, oeufs bio, avec  gluten ','Le Kouign Amann',7,1),(16,'gateau','crème foutté café, ganache au chocolat, entre des biscuits  joconde , une feuille d\'or ',NULL,'farine blé, oeufs bio, beurre breton, sans gluten','L\'opéra',7,1),(17,'miniardise','Macaron à la framboise, ganache vanille',NULL,'farine blé ,sans gluten, beurre breton, oeux bio ','macaron géant ',16,1),(18,'gateau ','Pate feuilleté espacé de crème patissière vanille de Madagascare ',NULL,'farine blé, sans gluten','Millefeuille',9,1),(19,'miniardie','Pate choux fourré crème glacé vanille chocolat noire',NULL,'farine blé, sans gluten','Profiterole',8,1),(20,'gateau','Recette traditionnel Norvegienne',NULL,'farine de mais, beure, sucre, oeufs','Quatre quart',11,1),(21,'miniardise','Pate choux fourré crème vanille chocolat et glacage chocolat noire',NULL,'farine de blé, beure, chocolat pure','Religieuse ',8,1),(22,'miniardise ','Pate choux fourré crème patissière  et chantilly ',NULL,'farine de blé, lait , caramel beurre salé','Saint honore',11,1),(23,'tarte','Pomme cuite caraméliser, patte feuilleté',NULL,'farine blé, pomme bio, sans gluten','Tarte tatin',10,1),(24,'tarte','Pate à choux surcre glacé crème patissere',NULL,'farine de blé, beure, lait','Tropézienne',8,1);
/*!40000 ALTER TABLE `patisserie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `patisserie_seq`
--

LOCK TABLES `patisserie_seq` WRITE;
/*!40000 ALTER TABLE `patisserie_seq` DISABLE KEYS */;
INSERT INTO `patisserie_seq` VALUES (8);
/*!40000 ALTER TABLE `patisserie_seq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-25 14:35:02
