# Listener Interfaces

|   Nombre    | Descripcion                                                                                       | Lista de metodos                                                                                                                           |
|:-----------:|:-------- | :-------- |
| ActionEvent | Eventos del usuario en la interfaz (Click en botón, seleccionar elemento de lista/opción de menú | actionPerformed(ActionEvent e) |
| FocusEvent | Se genera cuando un elemento gana o pierde el foco | focusGained(FocusEvent e), focusLost(FocusEvent e) |
| MouseEvent | Mover puntero del raton, o que el puntero entre/salga de un componente, presionar/liberar botón) | mouseClicked(MouseEvent e), mouseEntered(MouseEvent e), mouseExited(MouseEvent e), mousePressed(MouseEvent e), mouseReleased(MouseEvent e) |
| KeyEvent | Entrada desde el teclado | keyPressed(KeyEvent e), keyReleased(KeyEvent e), keyTyped(KeyEvent e) |
| ItemEvent | Click en checkbox, click en elemento de lista, click en opción de menú | itemStateChanged(ItemEvent e) | 
| TextEvent | Cambiar el valor de un campo de texto | textValueChanged(TextEvent e) |
| WindowEvent | Activar/Desactivar ventana, cerrarla, minimizar, maximizar | windowActivated(WindowEvent), windowClosed(WindowEvent), windowClosing(WindowEvent), windowDeactivated(WindowEvent) |
| AdjustmentListener | Invocado cuando el valor del ajustable ha cambiado. | adjustmentValueChanged(AdjustementEvent e) |
| ComponentListener | Cuando el tamaño, la ubicación o la visibilidad del componente cambian | componentHidden(ComponentEvent e), componentMoved(ComponentEvent e), componentResized(ComponentEvent e), componentShown(ComponentEvent e) |
| ContainerListener | El contenido del contenedor cambia porque se ha agregado o quitado un componente | componentAdded(ContainerEvent e), componentRemoved(ContainerEvent e) |
| ItemListener | Cuando el usuario ha seleccionado o anulado la selección de un elemento. | itemStateChanged(ItemEvent e) |
| MouseMotionListener | Movimiento del ratón cuando se mueve o arrastra el ratón. | mouseDragged(MouseEvent e), mouseMoved(MouseEvent e) |

