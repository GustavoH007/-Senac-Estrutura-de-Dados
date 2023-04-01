package lista;
/*
 *  Professor Gerson Risso
 */
public class Lista {

    /**
     * Variavel in�cio
    */
    private Elemento inicio;
    /**
     * Variavel atual
    */
    private Elemento atual;
    /**
     * Variavel auxiliar
    */
    private Elemento aux;
    /**
     * Variavel auxiliar para contar o ID
    */
    private int cont = 1;
    
    /**
     * M�todo criado para inserir produtos
     * @param objeto
    */
    public void inserirProduto(Object objeto) {
        Produto produto = (Produto)objeto;// CAST - conversao tempor�ria
        produto.setId(++cont);
        if (inicio == null) { // verifica se a lista est� vazia
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual; // fica junto do atual
        }
    }

    /**
     * M�todo criado para inserir contatos  
     * @param objeto
    */   
    public void inserirContato(Object objeto) {
        Contato contato = (Contato)objeto;// CAST - conversao tempor�ria
        contato.setId(++cont);
        if (inicio == null) { // verifica se a lista est� vazia
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual; // fica junto do atual
        }
    }


    /**
     * M�todo criado para exibir a lista dos contatos
     */
    public void exibirContatos() {

        Elemento x = inicio;

        while (x != null ) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }
    /**
     * M�todo criado para exibir a lista dos produtos
     */
    public void exibirProdutos() {

        Elemento x = inicio;

        while (x != null ) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }

    /**
     * M�todo de inst�ncia criado para pesquisar objetos pelo ID (Contatos)
     * Realiza a busca linear em uma lista simplesmente ligada
     * Retornando um array do tipo object, onde:
     * �ndice 0 - Endereco do elemento a ser removido
     * �ndice 1 - Endereco do elemento anterior
     * �ndice 2 - O tipo abstrato de dados no elemento
     * 
     * @param id int
     * @return Object[]
    */
    public Object[] pesquisarIdContato(int id) {
        Object[] v = new Object[3];
        Elemento e = inicio;
        Elemento auxRem = null;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();
            if (id == c.getId()) {
                v[0] = e;
                v[1] = auxRem;
                v[2] = c;
                return v;
            }
            auxRem = e;
           e=e.getProx();
        }
        return null;
    }
    
    public void removerIdContato(int id) {
        Object[] obj = pesquisarIdContato(id);
        if(obj != null) {
            Elemento e = (Elemento) obj[0];
            Elemento auxRem = (Elemento) obj[1];
            if(e == inicio) { // 1 - Remocao do primeiro elemento
                inicio = e.getProx();
                e.setProx(null);
            } else if(e == atual) { // 2 - Remocao do ultimo elemento
                atual = auxRem;
                aux = auxRem;
                auxRem.setProx(null);
            } else { // 3 - Remocao de elemento qualquer
                auxRem.setProx(e.getProx());
                e.setProx(null);
            }
        }
    }

    /**
     * M�todo de inst�ncia criado para pesquisar objetos pelo ID (Produtos)
     * @param id
    */
    public Object pesquisarIdProduto(int id) {
        if (inicio == null) {
            return null;
        } else {
            Elemento e = inicio;
            Produto p;
            while (e != null) {
                p = (Produto)e.getObjeto();
                if (id == p.getId()) {
                    return p;
                }
                e = e.getProx();
            }
        }
        return null;
    }

    public void desconto(String categoria, double desconto) {
        if (inicio == null) {
            return;
        } else {
            Elemento e = inicio;
            Produto p;
            double preco;
            while (e != null) {
                p = (Produto)e.getObjeto();
                if (categoria.equals(p.getCategoria())) {
                    preco = p.getPreco() - p.getPreco() * desconto;
                    p.setPreco(preco);
                }
                e = e.getProx();
            }

        }
    }

}
