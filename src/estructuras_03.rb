


def busqueda_binaria (array, valor)

    limite_inferior = 0
    limite_superior = array.lenght - 1

    while limite_inferior <= limite_superior do

        punto_medio = (limite_superior + limite_inferior) / 2
        valor_medio = array[punto_medio]

        if valor < valor_medio
            limite_superior = punto_medio - 1
        elsif valor > valor_medio
            limite_inferior = punto_medio + 1
        elsif valor == valor_medio
            return punto_medio
        end
    end
    return nil
end

