import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute, Router } from '@angular/router';
import { catchError, Observable, of } from 'rxjs';

import { ErrorDialogComponent } from './../../shared/components/error-dialog/error-dialog.component';
import { Curso } from './../models/curso';
import { CursosService } from './../services/cursos.service';

@Component({
  selector: 'app-cursos',
  templateUrl: './cursos.component.html',
  styleUrls: ['./cursos.component.scss']
})
export class CursosComponent implements OnInit {

  cursos$: Observable<Curso[]>;
  displayedColumns = ['nome', 'categoria', 'actions'];

  //cursosService: CursosService;

  constructor(private cursosService: CursosService, public dialog: MatDialog, private router: Router, private route: ActivatedRoute){

    this.cursos$ = this.cursosService.findAll()
    .pipe(
      catchError(error => {
        this.onError("Erro ao carregar cursos!");
        return of([])
      })
    );
  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg
    });
  }

  ngOnInit(): void {
  }

  adicionarCurso() {
    this.router.navigate(['new'], {relativeTo: this.route});
  }

}
