package com.ssafy.soldsolve.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPopWord is a Querydsl query type for PopWord
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPopWord extends EntityPathBase<PopWord> {

    private static final long serialVersionUID = 1412113526L;

    public static final QPopWord popWord = new QPopWord("popWord");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Integer> popId = createNumber("popId", Integer.class);

    public final StringPath title = createString("title");

    public QPopWord(String variable) {
        super(PopWord.class, forVariable(variable));
    }

    public QPopWord(Path<? extends PopWord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPopWord(PathMetadata metadata) {
        super(PopWord.class, metadata);
    }

}

