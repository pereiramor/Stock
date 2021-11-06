package com.betha.projeto.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCidade is a Querydsl query type for Cidade
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCidade extends EntityPathBase<Cidade> {

    private static final long serialVersionUID = -1149231568L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCidade cidade = new QCidade("cidade");

    public final com.betha.projeto.projeto.enterprise.QAbstractEntity _super = new com.betha.projeto.projeto.enterprise.QAbstractEntity(this);

    public final QEstado estado;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath nome = createString("nome");

    public QCidade(String variable) {
        this(Cidade.class, forVariable(variable), INITS);
    }

    public QCidade(Path<? extends Cidade> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCidade(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCidade(PathMetadata metadata, PathInits inits) {
        this(Cidade.class, metadata, inits);
    }

    public QCidade(Class<? extends Cidade> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.estado = inits.isInitialized("estado") ? new QEstado(forProperty("estado"), inits.get("estado")) : null;
    }

}

