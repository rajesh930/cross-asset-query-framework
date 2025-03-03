package com.ontic.asset.model;

import java.util.List;

/**
 * @author rajesh
 * @since 03/03/25 20:51
 */
public interface IRelationHalf {
    /**
     * Target asset type for which relation applies, e.g. Child__s
     */
    String target();

    /**
     * Relationship name from source e.g. children
     */
    String relation();

    /**
     * Display name of source relationship e.g. Children
     */
    String relationLabel();

    /**
     * Attributes applicable to this half of relationship
     */
    List<IFieldDefinition> attributes();

    /**
     * Whether target entities are many?
     */
    boolean isMany();
}
