package com.ontic.asset.model;

/**
 * @author rajesh
 * @since 03/03/25 18:49
 */
public interface IFieldDefinition {
    /**
     * Identifier of field
     */
    String name();

    /**
     * Label of field
     */
    String label();

    /**
     * Type of field
     */
    IFieldType fieldType();

    /**
     * If {@link IFieldType#isRelation()} is true, relationHalf should be present which describes relationship and applicable attributes
     */
    IRelationHalf relationHalf();

    /**
     * Asset which it belongs
     */
    String asset();
}
