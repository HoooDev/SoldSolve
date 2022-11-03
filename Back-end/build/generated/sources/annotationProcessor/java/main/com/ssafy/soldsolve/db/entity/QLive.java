package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLive is a Querydsl query type for Live
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QLive extends EntityPathBase<Live> {

    private static final long serialVersionUID = 1068077905L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLive live = new QLive("live");

    public final StringPath content = createString("content");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QProduct product;

    public final StringPath sessionId = createString("sessionId");

    public final StringPath title = createString("title");

    public QLive(String variable) {
        this(Live.class, forVariable(variable), INITS);
    }

    public QLive(Path<? extends Live> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLive(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLive(PathMetadata metadata, PathInits inits) {
        this(Live.class, metadata, inits);
    }

    public QLive(Class<? extends Live> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

