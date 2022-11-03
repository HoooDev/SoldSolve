package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomRead is a Querydsl query type for RoomRead
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoomRead extends EntityPathBase<RoomRead> {

    private static final long serialVersionUID = 7311606L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomRead roomRead = new QRoomRead("roomRead");

    public final NumberPath<Integer> buyerChat = createNumber("buyerChat", Integer.class);

    public final NumberPath<Integer> readId = createNumber("readId", Integer.class);

    public final QRoom room;

    public final NumberPath<Integer> sellerChat = createNumber("sellerChat", Integer.class);

    public final NumberPath<Integer> totalChat = createNumber("totalChat", Integer.class);

    public QRoomRead(String variable) {
        this(RoomRead.class, forVariable(variable), INITS);
    }

    public QRoomRead(Path<? extends RoomRead> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomRead(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomRead(PathMetadata metadata, PathInits inits) {
        this(RoomRead.class, metadata, inits);
    }

    public QRoomRead(Class<? extends RoomRead> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoom(forProperty("room"), inits.get("room")) : null;
    }

}

