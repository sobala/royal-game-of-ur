package com.game.royalgameofur.main;

import java.util.HashMap;
import java.util.Map;

public class Field {

    private final Map<String, FieldProperty> properties = new HashMap<>();

    public Field(final FieldProperty fieldType) {
        this.properties.put("fieldType", fieldType);
        this.properties.put("occupiedByPiece", null);
    }

    public Map<String, FieldProperty> getProperties() {
        return properties;
    }

    public FieldProperty getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    //TODO: Change return statement
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Field field = (Field) o;

        return this.properties.get("fieldSide").equals(field.properties.get("fieldSide"));
    }

    @Override
    public int hashCode() {
        return properties != null ? properties.hashCode() : 0;
    }
}
