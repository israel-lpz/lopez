# Listener Interfaces

|   Nombre    | Descripcion                                                                                       | Lista de metodos |
|-------- | -------- | -------- |
| ActionEvent | Eventos del usuario en la interfaz (Click en botón, seleccionar elemento de lista/ opción de menú | actionPerformed(ActionEvent e) |
| FocusEvent | Se genera cuando un elemento gana o pierde el foco | focusGained(FocusEvent e)  focusLost(FocusEvent e) |
| MouseEvent | Mover puntero del raton, o que el puntero entre/salga de un componente, presionar/liberar botón) | mouseClicked(MouseEvent e)  mouseEntered(MouseEvent e)  mouseExited(MouseEvent e)  mousePressed(MouseEvent e)  mouseReleased(MouseEvent e) |
| KeyEvent | Entrada desde el teclado | keyPressed(KeyEvent e)  keyReleased(KeyEvent e)   keyTyped(KeyEvent e) |

