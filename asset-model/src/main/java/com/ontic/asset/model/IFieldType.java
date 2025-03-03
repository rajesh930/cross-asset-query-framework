package com.ontic.asset.model;

/**
 * @author rajesh
 * @since 03/03/25 21:02
 */
public interface IFieldType {
    /**
     * Data type of field
     */
    String dataType();

    /**
     * Whether this field is relation type
     */
    boolean isRelation();
}
