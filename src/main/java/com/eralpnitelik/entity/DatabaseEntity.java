package com.eralpnitelik.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "db_entity")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class DatabaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long oid;

	private String name;

	private int number;

	public DatabaseEntity(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
}
