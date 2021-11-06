package com.betha.projeto.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFornecedor is a Querydsl query type for Fornecedor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFornecedor extends EntityPathBase<Fornecedor> {

    private static final long serialVersionUID = 1529217649L;

    public static final QFornecedor fornecedor = new QFornecedor("fornecedor");

    public final com.betha.projeto.projeto.enterprise.QAbstractPessoa _super = new com.betha.projeto.projeto.enterprise.QAbstractPessoa(this);

    public final StringPath cnpj = createString("cnpj");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath nome = _super.nome;

    public final EnumPath<Pagamento> pagamento = createEnum("pagamento", Pagamento.class);

    public final StringPath telefone = createString("telefone");

    public QFornecedor(String variable) {
        super(Fornecedor.class, forVariable(variable));
    }

    public QFornecedor(Path<? extends Fornecedor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFornecedor(PathMetadata metadata) {
        super(Fornecedor.class, metadata);
    }

}

