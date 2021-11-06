package com.betha.projeto.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovimentacao is a Querydsl query type for Movimentacao
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMovimentacao extends EntityPathBase<Movimentacao> {

    private static final long serialVersionUID = 73839375L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMovimentacao movimentacao = new QMovimentacao("movimentacao");

    public final com.betha.projeto.projeto.enterprise.QAbstractEntity _super = new com.betha.projeto.projeto.enterprise.QAbstractEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final QMercadoria mercadoria;

    public final EnumPath<Pagamento> pagamento = createEnum("pagamento", Pagamento.class);

    public final NumberPath<Double> quantidade = createNumber("quantidade", Double.class);

    public final EnumPath<TipoMovimentacao> tipo = createEnum("tipo", TipoMovimentacao.class);

    public QMovimentacao(String variable) {
        this(Movimentacao.class, forVariable(variable), INITS);
    }

    public QMovimentacao(Path<? extends Movimentacao> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMovimentacao(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMovimentacao(PathMetadata metadata, PathInits inits) {
        this(Movimentacao.class, metadata, inits);
    }

    public QMovimentacao(Class<? extends Movimentacao> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mercadoria = inits.isInitialized("mercadoria") ? new QMercadoria(forProperty("mercadoria")) : null;
    }

}

