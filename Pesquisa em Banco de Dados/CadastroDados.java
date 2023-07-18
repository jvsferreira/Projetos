package cadastro;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadastroDados {
    private Connection conn;

    public void conectar(String driver, String url, String user, String password) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o driver de banco de dados.");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível conectar ao banco de dados.");
            e.printStackTrace();
        }
    }

    public void desconectar() {
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível desconectar do banco de dados.");
            e.printStackTrace();
        }
    }

    public void buscar(int codigo, CadastraProduto gui) {
        PreparedStatement pstmt;
        ResultSet rs;

        try {
            pstmt = conn.prepareStatement("SELECT codigo, nome, descricao FROM produto WHERE codigo = ?");
            pstmt.setInt(1, codigo);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                gui.tCodigo.setText(String.valueOf(rs.getInt("codigo")));
                gui.tNome.setText(rs.getString("nome"));
                gui.tDescricao.setText(rs.getString("descricao"));
            } else {
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }

            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar o produto.");
            e.printStackTrace();
        }
    }

    public void inserir(int codigo, String nome, String descricao) {
        PreparedStatement pstmt;

        try {
            pstmt = conn.prepareStatement("INSERT INTO produto (codigo, nome, descricao) VALUES (?, ?, ?)");
            pstmt.setInt(1, codigo);
            pstmt.setString(2, nome);
            pstmt.setString(3, descricao);

            pstmt.execute();

            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir o produto.");
            e.printStackTrace();
        }
    }

    public void alterar(int codigo, String nome, String descricao) {
        PreparedStatement pstmt;

        try {
            pstmt = conn.prepareStatement("UPDATE produto SET nome = ?, descricao = ? WHERE codigo = ?");
            pstmt.setString(1, nome);
            pstmt.setString(2, descricao);
            pstmt.setInt(3, codigo);

            pstmt.execute();

            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar o produto.");
            e.printStackTrace();
        }
    }

    public void remover(int codigo) {
        PreparedStatement pstmt;

        try {
            pstmt = conn.prepareStatement("DELETE FROM produto WHERE codigo = ?");
            pstmt.setInt(1, codigo);

            pstmt.execute();

            pstmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao remover o produto.");
            e.printStackTrace();
        }
    }
}
