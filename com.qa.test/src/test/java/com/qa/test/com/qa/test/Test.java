package com.qa.test.com.qa.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) {
		try {

			FileInputStream file = new FileInputStream(new File("C:\\Users\\akshay.bhatia\\Desktop\\Test1.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);

			ArrayList<String> header = new ArrayList<String>();
			HashMap<String, Integer> mp = new HashMap<>();

			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();
				int i = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					try {
						header.add(cell.getStringCellValue());
					} catch (Exception e) {
						if(cell != null && cell.getNumericCellValue() != 0.0){							
							mp.put(header.get(i), new Integer((int) cell.getNumericCellValue()));							
						}
						i = i + 1;
					}
				}
				if (!sortByValues(mp).isEmpty()) {
					System.out.println(sortByValues(mp));
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static HashMap sortByValues(HashMap map) {
		List list = new LinkedList(map.entrySet());

		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}
}