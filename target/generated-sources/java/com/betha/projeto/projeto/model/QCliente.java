package com.betha.projeto.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCliente is a Querydsl query type for Cliente
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCliente extends EntityPathBase<Cliente> {

    private static final long serialVersionUID = -1175805842L;

    public static final QCliente cliente = new QCliente("cliente");

    public final com.betha.projeto.projeto.enterprise.QAbstractPessoa _super = new com.betha.projeto.projeto.enterprise.QAbstractPessoa(this);

    public final StringPath cpf = createString("cpf");

    public final EnumPath<Documento> documento = createEnum("documento", Documento.class);

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath nome = _super.nome;

    public final EnumPath<Pagamento> pagamento = createEnum("pagamento", Pagamento.class);

    public final EnumPath<Raca> raca = createEnum("raca", Raca.class);

    public final StringPath rg = createString("rg");

    public final EnumPath<Sexo> sexo = createEnum("sexo", Sexo.class);

    //inherited
    public final StringPath telefone = _super.telefone;

    public QCliente(String variable) {
        super(Cliente.class, forVariable(variable));
    }

    public QCliente(Path<? extends Cliente> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCliente(PathMetadata metadata) {
        super(Cliente.class, metadata);
    }

}

