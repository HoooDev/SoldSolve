package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = 1497470058L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduct product = new QProduct("product");

    public final StringPath category = createString("category");

    public final StringPath content = createString("content");

    public final ListPath<Deal, QDeal> deals = this.<Deal, QDeal>createList("deals", Deal.class, QDeal.class, PathInits.DIRECT2);

    public final DateTimePath<java.sql.Timestamp> liveTime = createDateTime("liveTime", java.sql.Timestamp.class);

    public final NumberPath<Integer> no = createNumber("no", Integer.class);

    public final ListPath<Offer, QOffer> offers = this.<Offer, QOffer>createList("offers", Offer.class, QOffer.class, PathInits.DIRECT2);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final ListPath<ProductImg, QProductImg> productImg = this.<ProductImg, QProductImg>createList("productImg", ProductImg.class, QProductImg.class, PathInits.DIRECT2);

    public final StringPath region = createString("region");

    public final ListPath<Request, QRequest> requestsUser = this.<Request, QRequest>createList("requestsUser", Request.class, QRequest.class, PathInits.DIRECT2);

    public final NumberPath<Integer> state = createNumber("state", Integer.class);

    public final ListPath<TagProduct, QTagProduct> tag = this.<TagProduct, QTagProduct>createList("tag", TagProduct.class, QTagProduct.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final QUser user;

    public final NumberPath<Integer> viewCount = createNumber("viewCount", Integer.class);

    public final ListPath<Wish, QWish> wishes = this.<Wish, QWish>createList("wishes", Wish.class, QWish.class, PathInits.DIRECT2);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    public QProduct(Path<? extends Product> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProduct(PathMetadata metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

