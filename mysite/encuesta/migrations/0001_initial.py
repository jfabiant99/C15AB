# Generated by Django 2.1.1 on 2018-10-24 17:59

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Pregunta',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('pregunta', models.CharField(default='', max_length=255)),
                ('fecha_pub', models.DateTimeField(verbose_name='date published')),
            ],
        ),
    ]