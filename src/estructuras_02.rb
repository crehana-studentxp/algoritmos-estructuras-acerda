


def busqueda_lineal(array, valor)
    array.each do |elemento|
        if elemento == valor
            return valor
        elsif elemento > valor
            break
        end
    end
    return nil
end

