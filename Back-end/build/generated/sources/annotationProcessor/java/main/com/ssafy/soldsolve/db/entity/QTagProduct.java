package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTagProduct is a Querydsl query type for TagProduct
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTagProduct extends EntityPathBase<TagProduct> {

    private static final long serialVersionUID = 1773110938L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTagProduct tagProduct = new QTagProduct("tagProduct");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final QProduct product;

    public final QTag tag;

    public QTagProduct(String variable) {
        this(TagProduct.class, forVariable(variable), INITS);
    }

    public QTagProduct(Path<? extends TagProduct> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTagProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTagProduct(PathMetadata metadata, PathInits inits) {
        this(TagProduct.class, metadata, inits);
    }

    public QTagProduct(Class<? extends TagProduct> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
        this.tag = inits.isInitialized("tag") ? new QTag(forProperty("tag")) : null;
    }

}

