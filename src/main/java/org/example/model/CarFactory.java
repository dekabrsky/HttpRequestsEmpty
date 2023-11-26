package org.example.model;

import java.util.List;

public record CarFactory(
	String country,
	List<ModelsItem> models,
	String cyrillicName,
	String name,
	String id,
	boolean popular
) {
}