package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTag is a Querydsl query type for Tag
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTag extends EntityPathBase<Tag> {

    private static final long serialVersionUID = 1419934869L;

    public static final QTag tag = new QTag("tag");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final ListPath<TagProduct, QTagProduct> tagProducts = this.<TagProduct, QTagProduct>createList("tagProducts", TagProduct.class, QTagProduct.class, PathInits.DIRECT2);

    public QTag(String variable) {
        super(Tag.class, forVariable(variable));
    }

    public QTag(Path<? extends Tag> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTag(PathMetadata metadata) {
        super(Tag.class, metadata);
    }

}

