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
-- Dumping data for table `commande`
--

LOCK TABLES `commande` WRITE;
/*!40000 ALTER TABLE `commande` DISABLE KEYS */;
INSERT INTO `commande` VALUES (110,'\0','2022-10-26 09:55:09',0,2),(111,'\0','2022-10-26 09:55:56',0,1);
/*!40000 ALTER TABLE `commande` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `commande_patisserie`
--

LOCK TABLES `commande_patisserie` WRITE;
/*!40000 ALTER TABLE `commande_patisserie` DISABLE KEYS */;
INSERT INTO `commande_patisserie` VALUES (110,1,5),(110,2,3),(110,13,1),(111,1,1),(111,2,6);
/*!40000 ALTER TABLE `commande_patisserie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `commande_seq`
--

LOCK TABLES `commande_seq` WRITE;
/*!40000 ALTER TABLE `commande_seq` DISABLE KEYS */;
INSERT INTO `commande_seq` VALUES (112);
/*!40000 ALTER TABLE `commande_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `patisserie`
--

LOCK TABLES `patisserie` WRITE;
/*!40000 ALTER TABLE `patisserie` DISABLE KEYS */;
INSERT INTO `patisserie` VALUES (1,'gateau','Dessert crêmeux avec de la noisette et des amandes','paris-brest.jpg','farine de blé, avec gluten','Paris-Brest',7,1,50),(2,'tarte','Crème patissaire fraise bio espagne','tarte-fraise.jpg','farine de blé complet, sans gluten','Tarte aux Fraises',10,1,50),(3,'tarte','Crème patissaire pomme bio de Garonne','tarte-pommes.jpg','farine de blé complet, sans gluten','Tarte aux Pommes',11,1,50),(4,'tarte','Crème criton bio zeste  de citron basilic','tarte-citron.jpg','farine de blé complet, avec gluten','Tarte aux Citrons',12,1,50),(5,'tarte','Crème criton et meringue caramélisé','Tarte-au-citron meringue.jpg','farine de blé, sans gluten','Tarte cirton meringué',14,1,50),(6,'tarte','Crème fouté framboise bio palet breton','Tarte-aux-framboises.jpg','farine de blé, avec gluten','Tarte aux Framboises',10,1,50),(7,'tarte','Crème patissière chocolat au lait recouvert chololat noir','tarte-chocolat.jpg','farine de blé, chocolat arabica','Tarte aux trois chocolat',7,1,50),(8,'gateau ','Dessert composé d\'un gâteau brioché arrosé de rhum et chantilly ','baba-au-rhum.jpeg','Farine de blé, rhum martinique, avec gluten ','Baba aux Rhum ',10,1,50),(9,'miniardise','petit miniardise, mou à l\'intérieur et caramélisé à l\'extérieur, entouré de cannelures','canneles.jpg','lait bio sud ouest, farine blé complet ','Cannele',6,1,50),(10,'miniardise','Pâte à choux allongée et fourrée de crème au chocolat, avec un glaçage sur le dessus.','eclaire-chocolat.jpeg','farine de blé complet, sans gluten','Eclaire aux chocolat ',7,1,50),(11,'miniardise','Pâte à choux allongée et fourrée de crème pistache, avec un glaçage sur le dessus.','eclaire-pistache.jpg','farine de blé complet, sans gluten','Eclaire à la pistache',7,1,50),(12,'gateau','Gateau à base de  poudre d\'amandes et de blancs d\'œufs','financier.jpeg','farine de blé, amande bio, sans gluten','Financier',8,1,50),(13,'gateau','Mi-cuit chocolat ','fondant-au-chocolat.jpg','farine de blé, chocolat arabica, avec  gluten','Coeur Coulant',9,1,50),(14,'gateau','Fraises, de génoise, de crème mousseline et  d\'une couche de pâte d\'amande ','fraisier.jpg','farine blé, oeufs  bio, sans gluten','Fraisier',14,1,50),(15,'gateau','Pâte feuilletée, de beurre demi-sel et de sucre caramélisé','le-kouign-amann.png','farine blé, oeufs bio, avec  gluten ','Le Kouign Amann',7,1,50),(16,'gateau','crème foutté café, ganache au chocolat, entre des biscuits  joconde , une feuille d\'or ','lopera.jpg','farine blé, oeufs bio, beurre breton, sans gluten','L\'opéra',7,1,50),(17,'miniardise','Macaron à la framboise, ganache vanille','macaron-geant-vanille-framboise.jpg','farine blé ,sans gluten, beurre breton, oeux bio ','macaron géant ',16,1,50),(18,'gateau ','Pate feuilleté espacé de crème patissière vanille de Madagascare ','millefeuille.jpg','farine blé, sans gluten','Millefeuille',9,1,50),(19,'miniardie','Pate choux fourré crème glacé vanille chocolat noire','profiterole.jpg','farine blé, sans gluten','Profiterole',8,1,50),(20,'gateau','Recette traditionnel Norvegienne','quatre-quarts.jpg','farine de mais, beure, sucre, oeufs','Quatre quart',11,1,50),(21,'miniardise','Pate choux fourré crème vanille chocolat et glacage chocolat noire','religieuse-genate-chocolat.jpg','farine de blé, beure, chocolat pure','Religieuse ',8,1,50),(22,'miniardise ','Pate choux fourré crème patissière  et chantilly ','saint-honore.jpg','farine de blé, lait , caramel beurre salé','Saint honore',11,1,50),(23,'tarte','Pomme cuite caraméliser, patte feuilleté','tarte-tatin.jpg','farine blé, pomme bio, sans gluten','Tarte tatin',10,1,50),(24,'tarte','Pate à choux surcre glacé crème patissere','tarte-tropezienne.jpg','farine de blé, beure, lait','Tropézienne',8,1,50);
/*!40000 ALTER TABLE `patisserie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `patisserie_seq`
--

LOCK TABLES `patisserie_seq` WRITE;
/*!40000 ALTER TABLE `patisserie_seq` DISABLE KEYS */;
INSERT INTO `patisserie_seq` VALUES (1),(8);
/*!40000 ALTER TABLE `patisserie_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `utilisateur`
--

LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;
INSERT INTO `utilisateur` VALUES (1,'69009','yuko.sasa@mail.fr','mdpyuko','SASA','26','Yuko','client','rue Masaryk','0625493335',0,'Lyon',NULL),(2,'39000','romain@mail.fr','mdpromain','CHAPELAND','2','Romain','client','rue des Vergers','0678765434',1,'Saint-Claude',NULL),(100,'38000','toto@mail.fr','mdptoto','DUPOND','5','Toto','client','rue de Paris','0790875346',1,'Grenoble',NULL),(101,'69000','titi@mail.fr','mdptiti','DURAND','10bis','Titi','client','rue de Versailles','0790786543',3,'Lyon',NULL);
/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `utilisateur_seq`
--

LOCK TABLES `utilisateur_seq` WRITE;
/*!40000 ALTER TABLE `utilisateur_seq` DISABLE KEYS */;
INSERT INTO `utilisateur_seq` VALUES (106);
/*!40000 ALTER TABLE `utilisateur_seq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-26 16:22:32
