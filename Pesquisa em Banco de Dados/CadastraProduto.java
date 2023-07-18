package cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class CadastraProduto extends JFrame implements ActionListener {
    private JPanel fundo;
    private JPanel campos;
    private JPanel botoes;

    private JButton bBusca;
    private JButton bLimpa;
    private JButton bInsere;
    private JButton bAltera;
    private JButton bRemove;

    private JLabel lCodigo;
    private JLabel lNome;
    private JLabel lDescricao;

    public JTextField tCodigo;
    public JTextField tNome;
    public JTextField tDescricao;

    private CadastroDados cadastroDados;

    public CadastraProduto(CadastroDados cadastroDados) {
        super("Cadastro de Produtos");
        this.cadastroDados = cadastroDados;

        this.fundo = new JPanel(new BorderLayout());
        this.campos = new JPanel(new GridLayout(3, 2));
        this.botoes = new JPanel(new FlowLayout());

        this.lCodigo = new JLabel("Código:");
        this.lNome = new JLabel("Nome:");
        this.lDescricao = new JLabel("Descrição:");

        this.tCodigo = new JTextField(10);
        this.tNome = new JTextField(30);
        this.tDescricao = new JTextField(60);

        this.campos.add(lCodigo);
        this.campos.add(tCodigo);
        this.campos.add(lNome);
        this.campos.add(tNome);
        this.campos.add(lDescricao);
        this.campos.add(tDescricao);

        this.fundo.add(this.campos, BorderLayout.CENTER);

        this.bBusca = new JButton("Buscar");
        this.bLimpa = new JButton("Limpar");
        this.bInsere = new JButton("Incluir");
        this.bAltera = new JButton("Alterar");
        this.bRemove = new JButton("Remover");

        this.botoes.add(bBusca);
        this.botoes.add(bLimpa);
        this.botoes.add(bInsere);
        this.botoes.add(bAltera);
        this.botoes.add(bRemove);

        this.fundo.add(this.botoes, BorderLayout.SOUTH);

        this.getContentPane().add(this.fundo);

        this.setSize(500, 150);

        bBusca.addActionListener(this);
        bLimpa.addActionListener(this);
        bInsere.addActionListener(this);
        bAltera.addActionListener(this);
        bRemove.addActionListener(this);
    }

    private void acaoLimpar() {
        tCodigo.setText("");
        tNome.setText("");
        tDescricao.setText("");
    }

    private void acaoBuscar() {
        int codigo = -1;

        try {
            codigo = Integer.parseInt(tCodigo.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "O dado digitado não é um número!");
            acaoLimpar();
            return;
        }

        cadastroDados.buscar(codigo, this);
    }

    private void acaoInserir() {
        int codigo = -1;

        try {
            codigo = Integer.parseInt(tCodigo.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "O código digitado não é um número válido!");
            return;
        }

        String nome = tNome.getText();
        String descricao = tDescricao.getText();

        cadastroDados.inserir(codigo, nome, descricao);
        acaoLimpar();
    }

    private void acaoAlterar() {
        int codigo = -1;

        try {
            codigo = Integer.parseInt(tCodigo.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "O código digitado não é um número válido!");
            return;
        }

        String nome = tNome.getText();
        String descricao = tDescricao.getText();

        cadastroDados.alterar(codigo, nome, descricao);
        acaoLimpar();
    }

    private void acaoRemover() {
        int codigo = -1;

        try {
            codigo = Integer.parseInt(tCodigo.getText());
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "O código digitado não é um número válido!");
            return;
        }

        cadastroDados.remover(codigo);
        acaoLimpar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bLimpa) {
            acaoLimpar();
        } else if (e.getSource() == bBusca) {
            acaoBuscar();
        } else if (e.getSource() == bInsere) {
            acaoInserir();
        } else if (e.getSource() == bRemove) {
            acaoRemover();
        } else if (e.getSource() == bAltera) {
            acaoAlterar();
        }
    }

    public static void main(String[] args) {
        CadastroDados cadastroDados = new CadastroDados();
        cadastroDados.conectar("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/Parede", "postgres", "kakashi712");

        CadastraProduto gui = new CadastraProduto(cadastroDados);
        gui.setVisible(true);
    }
}
