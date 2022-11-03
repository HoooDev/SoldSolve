package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeal is a Querydsl query type for Deal
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDeal extends EntityPathBase<Deal> {

    private static final long serialVersionUID = 1067835089L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeal deal = new QDeal("deal");

    public final QUser buyer;

    public final NumberPath<Integer> dealId = createNumber("dealId", Integer.class);

    public final QProduct product;

    public QDeal(String variable) {
        this(Deal.class, forVariable(variable), INITS);
    }

    public QDeal(Path<? extends Deal> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeal(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeal(PathMetadata metadata, PathInits inits) {
        this(Deal.class, metadata, inits);
    }

    public QDeal(Class<? extends Deal> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.buyer = inits.isInitialized("buyer") ? new QUser(forProperty("buyer")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

