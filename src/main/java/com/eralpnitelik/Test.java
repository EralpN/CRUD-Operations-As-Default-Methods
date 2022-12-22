package com.eralpnitelik;

import java.util.ArrayList;

import com.eralpnitelik.dao.DatabaseEntityDao;
import com.eralpnitelik.entity.DatabaseEntity;

public class Test {

	public static void main(String[] args) {
		DatabaseEntityDao dbEntityDao = new DatabaseEntityDao();

		DatabaseEntity dbEntity1 = new DatabaseEntity("Eralp", 26);
		DatabaseEntity dbEntity2 = new DatabaseEntity("Kiki", 41);
		DatabaseEntity dbEntity3 = new DatabaseEntity("Kenny", 13);
		DatabaseEntity dbEntity4 = new DatabaseEntity("Hazel", 60);
		DatabaseEntity dbEntity5 = new DatabaseEntity("Cairon", 17);
		DatabaseEntity dbEntity6 = new DatabaseEntity("John", 35);

		dbEntityDao.create(dbEntity1);
		dbEntityDao.create(dbEntity2);
		dbEntityDao.create(dbEntity3);
		dbEntityDao.create(dbEntity4);
		dbEntityDao.create(dbEntity5);
		dbEntityDao.create(dbEntity6);
		System.out.println("Entities have been created on db.");

		ArrayList<DatabaseEntity> dbEntities = dbEntityDao.listAll();
		System.out.println("\nEntities on db:");
		for (DatabaseEntity dbEntity : dbEntities) {
			System.out.println(dbEntity);
		}

		System.out.println("\nFind entity (oid == 3):");
		System.out.println(dbEntityDao.find(3));

		System.out.println("\nUpdate entity (oid == 5).");
		dbEntityDao.update(5, new DatabaseEntity("Updated", 100));

		System.out.println("\nDelete entity (oid == 2).");
		dbEntityDao.delete(2);

		dbEntities = dbEntityDao.listAll();
		System.out.println("\nList entities on db again:");
		for (DatabaseEntity dbEntity : dbEntities) {
			System.out.println(dbEntity);
		}
	}

}
