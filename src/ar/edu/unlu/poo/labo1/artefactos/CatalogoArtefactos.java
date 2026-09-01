package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    //private Artefacto artefacto;

    Set<Artefacto> catalogo = new HashSet<>();

    List<Artefacto> tipoDeArtefactos = new ArrayList<>();

    Map<String, Integer> cantidadDeArtefactosPorTipo = new HashMap<>();

    public void agregarArtefacto(Artefacto artefacto){
         catalogo.add(artefacto);
         tipoDeArtefactos.add(artefacto);

    }

    public Set obtenerArtefactosUnicos(){
        return catalogo;
    }

    public List buscarArtefactosPorTipo(String tipo){

        return tipoDeArtefactos;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        int contador = 0;
        Map<String, Integer> mapeo;
        for(Artefacto tipoAct : catalogo){
            //tipoAct.getTipo();
            //mapeo<
        }
        //return mapeo;
    }

    public Artefacto obtenerArtefactoMasPoderoso(){
        if (tipoDeArtefactos.size() == 0){
            return null;
        }
        int poderAct = tipoDeArtefactos.get(0).getPoder();
        Artefacto artMayor = tipoDeArtefactos.get(0);
        for(Artefacto artefactoActual : tipoDeArtefactos){
            if (artefactoActual.getPoder() >= poderAct){
                poderAct = artefactoActual.getPoder();
                artMayor = artefactoActual;
            }
        }
        return artMayor;
    }
}
