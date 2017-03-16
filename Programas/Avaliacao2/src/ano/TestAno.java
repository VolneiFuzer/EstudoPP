package ano;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestAno
{
	private Ano ano;
	
	@Before
	public void criarData()
	{	ano = new Ano();
	}
	
	
	@Test
	public void testQtdDiasAnoBissexto()
	{	ano.setNumero(2012);
		assertTrue(ano.isBissexto());
		assertEquals(31, ano.getQtdDias(1));
		assertEquals(29, ano.getQtdDias(2));
		assertEquals(31, ano.getQtdDias(3));
		assertEquals(30, ano.getQtdDias(4));
		assertEquals(31, ano.getQtdDias(5));
		assertEquals(30, ano.getQtdDias(6));
		assertEquals(31, ano.getQtdDias(7));
		assertEquals(31, ano.getQtdDias(8));
		assertEquals(30, ano.getQtdDias(9));
		assertEquals(31, ano.getQtdDias(10));
		assertEquals(30, ano.getQtdDias(11));
		assertEquals(31, ano.getQtdDias(12));
	}
	
	@Test
	public void testQtdDiasAnoNaoBissexto()
	{	ano.setNumero(2015);
		assertFalse(ano.isBissexto());
		assertEquals(31, ano.getQtdDias(1));
		assertEquals(28, ano.getQtdDias(2));
		assertEquals(31, ano.getQtdDias(3));
		assertEquals(30, ano.getQtdDias(4));
		assertEquals(31, ano.getQtdDias(5));
		assertEquals(30, ano.getQtdDias(6));
		assertEquals(31, ano.getQtdDias(7));
		assertEquals(31, ano.getQtdDias(8));
		assertEquals(30, ano.getQtdDias(9));
		assertEquals(31, ano.getQtdDias(10));
		assertEquals(30, ano.getQtdDias(11));
		assertEquals(31, ano.getQtdDias(12));
	}
	
	@Test
	public void testEhAnoBissexto()
	{	int[] anos = new int[]
		{	1004, 1008, 1012, 1016, 1020, 1024, 1028, 1032, 1036, 1040, 1044, 1048, 1052, 1056, 1060,     
			1064, 1068, 1072, 1076, 1080, 1084, 1088, 1092, 1096, 1104, 1108, 1112, 1116, 1120, 1124,     
			1128, 1132, 1136, 1140, 1144, 1148, 1152, 1156, 1160, 1164, 1168, 1172, 1176, 1180, 1184,     
			1188, 1192, 1196, 1200, 1204, 1208, 1212, 1216, 1220, 1224, 1228, 1232, 1236, 1240, 1244,     
			1248, 1252, 1256, 1260, 1264, 1268, 1272, 1276, 1280, 1284, 1288, 1292, 1296, 1304, 1308,     
			1312, 1316, 1320, 1324, 1328, 1332, 1336, 1340, 1344, 1348, 1352, 1356, 1360, 1364, 1368,     
			1372, 1376, 1380, 1384, 1388, 1392, 1396, 1404, 1408, 1412, 1416, 1420, 1424, 1428, 1432,     
			1436, 1440, 1444, 1448, 1452, 1456, 1460, 1464, 1468, 1472, 1476, 1480, 1484, 1488, 1492,     
			1496, 1504, 1508, 1512, 1516, 1520, 1524, 1528, 1532, 1536, 1540, 1544, 1548, 1552, 1556,     
			1560, 1564, 1568, 1572, 1576, 1580, 1584, 1588, 1592, 1596, 1600, 1604, 1608, 1612, 1616,     
			1620, 1624, 1628, 1632, 1636, 1640, 1644, 1648, 1652, 1656, 1660, 1664, 1668, 1672, 1676,     
			1680, 1684, 1688, 1692, 1696, 1704, 1708, 1712, 1716, 1720, 1724, 1728, 1732, 1736, 1740,     
			1744, 1748, 1752, 1756, 1760, 1764, 1768, 1772, 1776, 1780, 1784, 1788, 1792, 1796, 1804,     
			1808, 1812, 1816, 1820, 1824, 1828, 1832, 1836, 1840, 1844, 1848, 1852, 1856, 1860, 1864,     
			1868, 1872, 1876, 1880, 1884, 1888, 1892, 1896, 1904, 1908, 1912, 1916, 1920, 1924, 1928,     
			1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988,     
			1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020
		};  
		for (int posicao = 0; posicao < anos.length; posicao++)
		{	ano.setNumero(anos[posicao]);
			assertTrue(ano.isBissexto());
			for (int desloc = 1; desloc < 3; desloc++)
			{	ano.setNumero(anos[posicao] + desloc);
				assertFalse(ano.isBissexto());
			}
		}
	}
}