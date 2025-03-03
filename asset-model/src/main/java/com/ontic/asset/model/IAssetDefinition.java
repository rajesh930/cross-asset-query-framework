package com.ontic.asset.model;

import java.util.List;

/**
 * @author rajesh
 * @since 03/03/25 18:50
 */
public interface IAssetDefinition {
    /**
     * Identifier of asset
     */
    String name();

    /**
     * Display name of asset
     */
    String label();

    /**
     * Plural display name of asset
     */
    String pluralLabel();

    /**
     * Description of asset
     */
    String description();

    /**
     * DB table where data is stored
     */
    String table();

    /**
     * Fields of asset
     */
    List<IFieldDefinition> fields();
}
