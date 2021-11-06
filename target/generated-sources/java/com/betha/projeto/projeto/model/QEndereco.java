package com.betha.projeto.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEndereco is a Querydsl query type for Endereco
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEndereco extends EntityPathBase<Endereco> {

    private static final long serialVersionUID = -1267622955L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEndereco endereco = new QEndereco("endereco");

    public final com.betha.projeto.projeto.enterprise.QAbstractEntity _super = new com.betha.projeto.projeto.enterprise.QAbstractEntity(this);

    public final QCidade cidade;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nomerua = createString("nomerua");

    public final NumberPath<Integer> numerocasa = createNumber("numerocasa", Integer.class);

    public QEndereco(String variable) {
        this(Endereco.class, forVariable(variable), INITS);
    }

    public QEndereco(Path<? extends Endereco> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEndereco(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEndereco(PathMetadata metadata, PathInits inits) {
        this(Endereco.class, metadata, inits);
    }

    public QEndereco(Class<? extends Endereco> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cidade = inits.isInitialized("cidade") ? new QCidade(forProperty("cidade"), inits.get("cidade")) : null;
    }

}

