# CHALLENGE - Concurso de preguntas y respuestas

***PROPIEDADES DE LA SOLUCIÓN***

Lenguaje de programación usado:
  - Capa de Presentación
    - Java
  - Capa de Negocio
    - Java
  - Capa de Persistencia
    - Java
    - MySQL

Banco de categorías y preguntas:
  - El juego cuenta con 9 categorías.
      - Complejidad 1:
        - Deportes - Fútbol
        - Conocimiento General I
      - Complejidad 2:
        - Conocimiento General II
        - Geografía
      - Complejidad 3:
        - Conocimiento General III
      - Complejidad 4:
        - Conocimiento General IV
        - Química
        - Biología
      - Complejidad 5:
        - Preguntas Capciosas I

  - 45 preguntas.
  - 180 opciones de respuesta, 45 correctas y 137 incorrectas.

***MODELADO:***

![alt text](https://i.imgur.com/dWR7Dps.png)

FUNCIONALIDADES:
  - Partida
    - Iniciar Juego
      - Se selecciona de forma aleatoría las categorías y preguntas a mostrar.
    - Seleccionar opción de respuesta dada la pregunta
      - Si hay un jugador registrado, este puede responder a la pregunta dada.
      - Cada ronda tiene un premio, al avanzar las rondas el acumulado irá aumentando.
      - Si la opción es correcta: Se continúa a la siguiente ronda y el acumulado aumenta.
      - Si la opción es incorrecta: Se dará fin a la partida, se guardarán los datos de la misma(El acumulado en este caso es 0).
      - Si el jugador responde correctamente la pregunta de la ronda 5 finaliza la partida automáticamente y se considera que el jugador ganó la partida.
    - Seleccionar opción de retirarse de la partida
      - El jugador tiene la opción de retirarse siempre y cuando no sea la primera ronda: Se da por finalizada la partida, retirandose con el acumulado del momento.
    - Estadísticas de la partida en curso: Se detalla en pantalla los siguientes datos
      - Jugador: Se detalla el Nickname del jugador que está participando en la partida.
      - Ronda Actual: Se indica la ronda actual, el número de ronda indica la complejidad de las categorías y sus preguntas, dónde la complejidad es ascendente.
      - Premio Actual: Cantidad de 'dinero' a recibir en caso acertar la pregunta de la actual ronda.
      - Acumulado: Se detalla la cantidad del acumulado producto de los aciertos en las anteriores rondas.
    - Restricciones
      - No se puede dar inicio a la partida si no hay jugadores registrados en el sistema.
      - No es posible avanzar si no ha seleccionado ninguna opción de respuesta.
      - Una vez iniciado la partida, no se puede cambiar de participante hasta que esta termine.
      - No es posible retirarse en la primera ronda siendo que el acumulado es 0.
  - Perfil
    - Crear Perfil
      - El usuario puede dar de alta en el sistema a un nuevo perfil, detallando el nickname(Único).
    - Estadísticas globales e Historial de partidas jugadas
      - El usuario puede seleccioanr un perfil entre los creados y observar tanto sus estadísticas globales como el historial de sus partidas.
      - Estadísticas Globales: 
        - Cantidad total de partidas jugadas.
        - Cantidad total de partidas ganas(Partidas en la que el jugador acertó correctamente las 5 preguntas).
        - Cantidad total de respuestas acertadas.
        - Cantidad total de dinero obtenido según la cantidad de aciertos en las partidas.
      - Historial de partidas: Se detalla en forma de tabla todas las partidas de un jugador con sus respectivos datos:
        - Número de partdia
        - Rondas ganadas
        - Dinero obtenido
