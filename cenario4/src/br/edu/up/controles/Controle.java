
package br.edu.up.controles;
import java.util.ArrayList;
import java.util.List;
import br.edu.up.modelos.*;
public class Controle {

    
    
           
            
           
    
        
       
            private static final int MAX_VAGAS = 10;
            private List<Veiculos> veiculos;
            private int veiculosEntrados;
            private int veiculosSaidos;
        
            public Controle() {
                this.veiculos = new ArrayList<>();
                this.veiculosEntrados = 0;
                this.veiculosSaidos = 0;
            }
        
            public boolean adicionarVeiculo(Veiculos veiculo) {
                if (veiculos.size() < MAX_VAGAS) {
                    veiculos.add(veiculo);
                    veiculosEntrados++;
                    return true;
                } else {
                    return false;
                }
            }
        
            public boolean removerVeiculos(String placa) {
                for (Veiculos veiculo : veiculos) {
                    if (veiculo.getPlaca().equals(placa)) {
                        veiculos.remove(veiculo);
                        veiculosSaidos++;
                        return true;
                    }
                }
                return false;
            }
        
            public List<Veiculos> listarVeiculos() {
                return veiculos;
            }
        
            public int getVeiculosEntrados() {
                return veiculosEntrados;
            }
        
            public int getVeiculosSaidos() {
                return veiculosSaidos;
            }
        
            public int calcularPagamento() {
                return veiculosSaidos * 5;
            }
        }
    
    
    



