/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Dao.Aluno;
import Dao.Sessao;
import java.awt.Font;
import java.util.Collections;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irlei
 */
public class TabelaDeJogadores extends JTable {

    public static JScrollPane quadroDeJogadores(Sessao sessao) {
        final DefaultTableModel modelo = new DefaultTableModel();
        // constrói a tabela
        modelo.fireTableStructureChanged();
        JTable tabela = new JTable(modelo);

        // Cria  colunas
        modelo.addColumn("Nome");
        modelo.addColumn("Turma");
        modelo.addColumn("Pontos");
        modelo.addColumn("Tempo");

        Collections.sort(sessao.getAlunos());
        
        for (Aluno al : sessao.getAlunos()) {
            String tempo = al.getTempo() > 1 ? "minutos" : "minuto";
            modelo.addRow(new Object[]{al.getNome() + " " + al.getSobrenome(), al.getTurma(), al.getPontos(), al.getTempo() + " " + tempo});
        }
        tabela.getColumn("Nome").setMaxWidth(250);
        tabela.setShowVerticalLines(false);
        tabela.setRowHeight(28);
        tabela.getColumn("Nome").setResizable(false);
        tabela.getColumn("Pontos").setMaxWidth(60);
        tabela.getColumn("Pontos").setResizable(false);
        tabela.getColumn("Turma").setMaxWidth(50);
        tabela.getColumn("Turma").setResizable(false);
        tabela.getColumn("Tempo").setMaxWidth(90);
        tabela.getColumn("Tempo").setResizable(false);
        tabela.setFont(new Font("arial", 1, 14));
        // tabela.setShowGrid(true);
        tabela.setEnabled(false);
        tabela.setVisible(true);
        JScrollPane scroll = new JScrollPane(tabela);

        return scroll;
    }
}
