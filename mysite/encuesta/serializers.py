##Importando librerias a utilizar para el serializer:
from .models import Pregunta
from rest_framework import serializers

class PreguntaSerializer (serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Pregunta
        fields  = ('id', 'pregunta')
        