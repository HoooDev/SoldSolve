package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1068355120L;

    public static final QUser user = new QUser("user");

    public final DateTimePath<java.sql.Timestamp> createDate = createDateTime("createDate", java.sql.Timestamp.class);

    public final ListPath<Deal, QDeal> deals = this.<Deal, QDeal>createList("deals", Deal.class, QDeal.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<Message, QMessage> messages = this.<Message, QMessage>createList("messages", Message.class, QMessage.class, PathInits.DIRECT2);

    public final StringPath nickname = createString("nickname");

    public final ListPath<Offer, QOffer> offers = this.<Offer, QOffer>createList("offers", Offer.class, QOffer.class, PathInits.DIRECT2);

    public final StringPath password = createString("password");

    public final ListPath<Product, QProduct> products = this.<Product, QProduct>createList("products", Product.class, QProduct.class, PathInits.DIRECT2);

    public final StringPath profileUrl = createString("profileUrl");

    public final ListPath<Request, QRequest> requests = this.<Request, QRequest>createList("requests", Request.class, QRequest.class, PathInits.DIRECT2);

    public final ListPath<Review, QReview> review1 = this.<Review, QReview>createList("review1", Review.class, QReview.class, PathInits.DIRECT2);

    public final ListPath<Review, QReview> review2 = this.<Review, QReview>createList("review2", Review.class, QReview.class, PathInits.DIRECT2);

    public final ListPath<Review, QReview> reviews = this.<Review, QReview>createList("reviews", Review.class, QReview.class, PathInits.DIRECT2);

    public final StringPath role = createString("role");

    public final ListPath<Room, QRoom> room1 = this.<Room, QRoom>createList("room1", Room.class, QRoom.class, PathInits.DIRECT2);

    public final ListPath<Room, QRoom> room2 = this.<Room, QRoom>createList("room2", Room.class, QRoom.class, PathInits.DIRECT2);

    public final ListPath<Room, QRoom> roomList = this.<Room, QRoom>createList("roomList", Room.class, QRoom.class, PathInits.DIRECT2);

    public final NumberPath<Double> score = createNumber("score", Double.class);

    public final StringPath userid = createString("userid");

    public final StringPath username = createString("username");

    public final ListPath<Wish, QWish> wishes = this.<Wish, QWish>createList("wishes", Wish.class, QWish.class, PathInits.DIRECT2);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

