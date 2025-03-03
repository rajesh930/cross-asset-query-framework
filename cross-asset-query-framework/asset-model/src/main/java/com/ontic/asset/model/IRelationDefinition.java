package com.ontic.asset.model;

/**
 * @author rajesh
 * @since 03/03/25 18:50
 */
public interface IRelationDefinition {

    /**
     * Forward relationship
     */
    IRelationHalf forward();

    /**
     * Reverse relationship
     */
    IRelationHalf reverse();

    /**
     * Table where this relation will be stored
     */
    String table();
}
