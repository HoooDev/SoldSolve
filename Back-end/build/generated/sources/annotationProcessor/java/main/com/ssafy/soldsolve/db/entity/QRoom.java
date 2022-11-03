package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoom is a Querydsl query type for Room
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoom extends EntityPathBase<Room> {

    private static final long serialVersionUID = 1068262208L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoom room = new QRoom("room");

    public final QUser buyer;

    public final NumberPath<Integer> buyerOut = createNumber("buyerOut", Integer.class);

    public final ListPath<Chat, QChat> chat = this.<Chat, QChat>createList("chat", Chat.class, QChat.class, PathInits.DIRECT2);

    public final NumberPath<Integer> inUser = createNumber("inUser", Integer.class);

    public final NumberPath<Integer> isRead = createNumber("isRead", Integer.class);

    public final StringPath lastMessage = createString("lastMessage");

    public final NumberPath<Integer> roomId = createNumber("roomId", Integer.class);

    public final QRoomRead roomRead;

    public final QUser seller;

    public final NumberPath<Integer> sellerOut = createNumber("sellerOut", Integer.class);

    public QRoom(String variable) {
        this(Room.class, forVariable(variable), INITS);
    }

    public QRoom(Path<? extends Room> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoom(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoom(PathMetadata metadata, PathInits inits) {
        this(Room.class, metadata, inits);
    }

    public QRoom(Class<? extends Room> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.buyer = inits.isInitialized("buyer") ? new QUser(forProperty("buyer")) : null;
        this.roomRead = inits.isInitialized("roomRead") ? new QRoomRead(forProperty("roomRead"), inits.get("roomRead")) : null;
        this.seller = inits.isInitialized("seller") ? new QUser(forProperty("seller")) : null;
    }

}

