
package mundo;

import gfutria.Logic;

/**
 * Clase encargada de la logica de los movimientos del bote en el problema de los
 * misioneros y canibales.
 * @version 2.0.
 * @author Mario Palencia
 * @author Kevin Navarrete
 * @author Gabriel Romero
 * @author Daniel Torres
 */
public class Misioneros extends Logic {

    /**
     * Misioneros en el lado izquierdo del rio.
     */
    private int misionerosIzquierda;
    /**
     * Canibales en el lado izquierdo del rio.
     */
    private int canibalesIzquierda;
    /**
     * Estado del bote en el lado izquierdo del rio.
     */
    private int boteIzquierda;
    /**
     * Misioneros en el lado derecho del rio.
     */
    private int misionerosDerecha;
    /**
     * Canibales en el lado derecho del rio.
     */
    private int canibalesDerecha;
    /**
     * Estado del bote en el lado derecho del rio.
     */
    private int boteDerecha;

    /**
     * Constructor vacio de la clase Misioneros.
     */
    public Misioneros() {
    }
    
    /**
     *  Constructor con las variables inicializadas.
     * 
     * @param misionerosIzquierda Cantidad de misioneros en la orilla izquierda.
     * @param canibalesIzquierda Cantidad de canibales en la orilla izquierda.
     * @param boteIzquierda Estado del bote en la orilla izquierda (0 o 1).
     * @param misionerosDerecha Cantidad de misioneros en la orilla derecha.
     * @param canibalesDerecha Cantidad de canivales en la orilla derecha.
     * @param boteDerecha Estado del bote en la orilla derecha (0 o 1).
     */
    public Misioneros(int misionerosIzquierda, int canibalesIzquierda, int boteIzquierda, int misionerosDerecha, int canibalesDerecha, int boteDerecha) {
        this.misionerosIzquierda = misionerosIzquierda;
        this.canibalesIzquierda = canibalesIzquierda;
        this.boteIzquierda = boteIzquierda;
        this.misionerosDerecha = misionerosDerecha;
        this.canibalesDerecha = canibalesDerecha;
        this.boteDerecha = boteDerecha;
    }
    
    /**
     * Obtener la cantidad de misioneros que estan en la orilla izquierda.
     * @return La cantidad de misioneros que estan en la orilla izquierda.
     */
    public int getMisionerosIzquierda() {
        return misionerosIzquierda;
    }

    /**
     * Establece la cantidad de misioneros en la orilla izquierda.
     * @param misionerosIzquierda La cantidad de misioneros en la orilla izquierda.
     */
    public void setMisionerosIzquierda(int misionerosIzquierda) {
        this.misionerosIzquierda = misionerosIzquierda;
    }

     /**
      * Obtener la cantidad de canibales que estan en la orilla izquierda.
      * @return La cantidad de canibales que estan en la orilla izquierda.
      */
    public int getCanibalesIzquierda() {
        return canibalesIzquierda;
    }
    
    /**
     * Establece la cantidad de canibales en la orilla izquierda.
     * @param canibalesIzquierda La cantidad de canibales en la orilla izquierda.
     */
    public void setCanibalesIzquierda(int canibalesIzquierda) {
        this.canibalesIzquierda = canibalesIzquierda;
    }

    /**
     * Obtiene el estado del bote en la orilla izquierda.
     * @return El estado del bote en la orilla izquierda.
     */
    public int getBoteIzquierda() {
        return boteIzquierda;
    }

    /**
     * Establece el estado del bote en la orilla izquierda.
     * @param boteIzquierda El estado del bote en la orilla izquierda.
     */
    public void setBoteIzquierda(int boteIzquierda) {
        this.boteIzquierda = boteIzquierda;
    }

    /**
     * Obtener la cantidad de misioneros que estan en la orilla derecha.
     * @return La cantidad de misioneros que estan en la orilla derecha.
     */
    public int getMisionerosDerecha() {
        return misionerosDerecha;
    }

    /**
     * Establece la cantidad de misioneros en la orilla derecha.
     * @param misionerosDerecha Cantidad de misioneros en la orilla derecha.
     */
    public void setMisionerosDerecha(int misionerosDerecha) {
        this.misionerosDerecha = misionerosDerecha;
    }

    /**
     * Obtener la cantidad de canibales que estan en la orilla derecha.
     * @return La cantidad de canivales que estan en la orilla derecha.
     */
    public int getCanibalesDerecha() {
        return canibalesDerecha;
    }

    /**
     * Establece la cantidad de canibales en la orilla derecha.
     * @param canibalesDerecha cantidad de  canibales en la orilla derecha.
     */
    public void setCanibalesDerecha(int canibalesDerecha) {
        this.canibalesDerecha = canibalesDerecha;
    }

    /**
     * Obtiene el estado del bote en la orilla derecha.
     * @return Estado del bote en la orilla derecha.
     */
    public int getBoteDerecha() {
        return boteDerecha;
    }

     /**
      * Establece el estado del bote en la orilla derecha.
      * @param boteDerecha Estado del bote en la orilla derecha.
      */
    public void setBoteDerecha(int boteDerecha) {
        this.boteDerecha = boteDerecha;
    }

    /**
     * Mueve 1 misioneros a la otra orilla del rio tanto de derecha a izquierda 
     * como de izquierda a derecha.
     */
    public void mover1Misionero() {
    if (boteIzquierda == 1) {
        if (misionerosIzquierda >= 1) {
            if ((canibalesIzquierda <= misionerosIzquierda - 1 || misionerosIzquierda - 1 == 0) && (boteDerecha + 1 <= 2) 
                    && (canibalesDerecha  <= misionerosDerecha+1 || canibalesDerecha==0)) {
                misionerosIzquierda -= 1;
                misionerosDerecha += 1;
                boteDerecha += 1;
                boteIzquierda -= 1;
            }
        }
    } else if (boteDerecha == 1) { 
        if (misionerosDerecha >= 1) {
            if ((canibalesDerecha <= misionerosDerecha - 1 || misionerosDerecha - 1 == 0) && (boteIzquierda + 1 <= 2) 
                    && (canibalesIzquierda  <= misionerosIzquierda +1||canibalesIzquierda == 0)) {
                misionerosDerecha -= 1;
                misionerosIzquierda += 1;
                boteDerecha -= 1;
                boteIzquierda += 1;
            }
        }
    }
}

    /**
     * Mueve 1 canibal a la otra orilla del rio tanto de derecha a izquierda 
     * como de izquierda a derecha.
     */
    public void mover1Canibal() {
        if (boteIzquierda == 1) {
            if (canibalesIzquierda >= 1 && (canibalesIzquierda - 1 <= misionerosIzquierda || misionerosIzquierda == 0)
                    && (boteDerecha + 1 <= 2) && (canibalesDerecha + 1 <= misionerosDerecha || misionerosDerecha == 0)) {
                canibalesIzquierda -= 1;
                canibalesDerecha += 1;
                boteDerecha += 1;
                boteIzquierda -= 1;
            }
        } else if (canibalesDerecha >= 1 && (canibalesDerecha - 1 <= misionerosDerecha || misionerosDerecha == 0)
                && (boteIzquierda + 1 <= 2) && (canibalesIzquierda + 1 <= misionerosIzquierda || misionerosIzquierda == 0)) {
            if (canibalesDerecha >= 1) {
                canibalesDerecha -= 1;
                canibalesIzquierda += 1;
                boteDerecha -= 1;
                boteIzquierda += 1;
            }
        }
    }

    /**
     * Mueve 2 misioneros a la otra orilla del rio tanto de derecha a izquierda 
     * como de izquierda a derecha.
     */
    public void mover2Misioneros() {
    if (boteIzquierda == 1) {
        if (misionerosIzquierda >= 2) {
            if ((canibalesIzquierda <= misionerosIzquierda - 2 || misionerosIzquierda - 2 == 0) && (boteDerecha + 1 <= 2) 
                    && (canibalesDerecha  <= misionerosDerecha+2|| canibalesDerecha == 0)) {
                misionerosIzquierda -= 2;
                misionerosDerecha += 2;
                boteDerecha += 1;
                boteIzquierda -= 1;
            }
        }
    } else if (boteDerecha == 1) { 
        if (misionerosDerecha >= 2) {
            if ((canibalesDerecha <= misionerosDerecha - 2 || misionerosDerecha - 2 == 0) && (boteIzquierda + 1 <= 2) 
                    && (canibalesIzquierda <= misionerosIzquierda+2 || canibalesIzquierda == 0)) {
                misionerosDerecha -= 2;
                misionerosIzquierda += 2;
                boteDerecha -= 1;
                boteIzquierda += 1;
            }
        }
    }
}


//4
    /**
     * Mueve 2 canibales a la otra orilla del rio tanto de derecha a izquierda 
     * como de izquierda a derecha.
     */
    public void mover2Canibales() {
        if (boteIzquierda == 1) {
            if (canibalesIzquierda >= 2 && (canibalesIzquierda - 2 <= misionerosIzquierda || misionerosIzquierda == 0)
                    && (boteDerecha + 1 <= 2) && (canibalesDerecha + 2 <= misionerosDerecha || misionerosDerecha == 0)) {
                canibalesIzquierda -= 2;
                canibalesDerecha += 2;
                boteDerecha += 1;
                boteIzquierda -= 1;
            }
        } else if (boteDerecha == 1) {
            if (canibalesDerecha >= 2 && (canibalesDerecha - 2 <= misionerosDerecha || misionerosDerecha == 0)
                    && (boteIzquierda + 1 <= 2) && (canibalesIzquierda + 2 <= misionerosIzquierda || misionerosIzquierda == 0)) {
                canibalesDerecha -= 2;
                canibalesIzquierda += 2;
                boteDerecha -= 1;
                boteIzquierda += 1;
            }
        }
    }

    /**
     * Mueve 1 canibal y 1 misionero a la otra orilla del rio tanto de izquieda
     * a derecha como de derecha a izquierda.
     */
    public void mover1canibalY1misionero() {
        if (boteIzquierda == 1) {
            if (misionerosIzquierda >= 1 && canibalesIzquierda >= 1) {
                if ((canibalesIzquierda - 1 <= misionerosIzquierda - 1 || misionerosIzquierda - 1 == 0) && (boteDerecha + 1 <= 2) 
                        && (canibalesDerecha + 1 <= misionerosDerecha + 1 || misionerosDerecha + 1 == 0)) {
                    misionerosIzquierda -= 1;
                    canibalesIzquierda -= 1;
                    misionerosDerecha += 1;
                    canibalesDerecha += 1;
                    boteDerecha += 1;
                    boteIzquierda -= 1;
                }
            }
        } else if (boteDerecha == 1) {
            if (misionerosDerecha >= 1 && canibalesDerecha >= 1) {
                if ((canibalesDerecha - 1 <= misionerosDerecha - 1 || misionerosDerecha - 1 == 0) && (boteIzquierda + 1 <= 2) 
                        && (canibalesIzquierda + 1 <= misionerosIzquierda + 1 || misionerosIzquierda + 1 == 0)) {
                    misionerosDerecha -= 1;
                    canibalesDerecha -= 1;
                    misionerosIzquierda += 1;
                    canibalesIzquierda += 1;
                    boteDerecha -= 1;
                    boteIzquierda += 1;
                }
            }
        }
    }
    
    /**
     * Clona un objeto de tipo Misioneros.
     * @param logic El objeto a clonar.
     * @return Una instancia clonada de la clase Misioneros.
     */
    @Override
    public Logic cloneObject(Logic logic) {
        Misioneros clonMisioneros = new Misioneros();

        clonMisioneros.setMisionerosIzquierda(((Misioneros) logic).getMisionerosIzquierda());
        clonMisioneros.setCanibalesIzquierda(((Misioneros) logic).getCanibalesIzquierda());
        clonMisioneros.setBoteIzquierda(((Misioneros) logic).getBoteIzquierda());

        clonMisioneros.setMisionerosDerecha(((Misioneros) logic).getMisionerosDerecha());
        clonMisioneros.setCanibalesDerecha(((Misioneros) logic).getCanibalesDerecha());
        clonMisioneros.setBoteDerecha(((Misioneros) logic).getBoteDerecha());

        return (Logic) clonMisioneros;
    }

    /**
     * Devuelve el estado inicial del problema de los misioneros.
     * @return El estado actual del problema en formato de cadena.
     */
    @Override
    public String state() {
        return misionerosIzquierda + ":" + canibalesIzquierda + ":" + boteIzquierda + "=" + misionerosDerecha + ":" + canibalesDerecha + ":" + boteDerecha;
    }
    
    /**
     * Realiza una acción específica según el parámetro proporcionado.
     * @param i El número de la acción a realizar.
     */
    @Override
    public void action(int i) {
        switch (i) {
            case 1:
                mover1Misionero();
                break;
            case 2:
                mover1Canibal();
                break;
            case 3:
                mover2Misioneros();
                break;
            case 4:
                mover2Canibales();
                break;
            case 5:
                mover1canibalY1misionero();
                break;
        }
    }

}
